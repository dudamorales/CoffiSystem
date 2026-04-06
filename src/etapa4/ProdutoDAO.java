package etapa4;

         
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProdutoDAO {

    public void inserir(Produto p) {
        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO produto (nome, valor, quantidade, validade, idCategoria, idFornecedor) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p.getNomeProd());
            stmt.setDouble(2, p.getValor());
            stmt.setInt(3, p.getQuantidadeEstoque());
            stmt.setString(4, p.getValidade());
            stmt.setInt(5, p.getIdCategoria());
            stmt.setInt(6, p.getIdFornecedor());

            stmt.executeUpdate();
            stmt.close();
            conn.close();

            System.out.println("Produto inserido com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto");
        }
    }

    
    public ArrayList<Produto> listar() {
        ArrayList<Produto> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM produto";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("valor"),
                        rs.getInt("quantidade"),
                        rs.getString("validade"),
                        rs.getInt("idCategoria"),
                        rs.getInt("idFornecedor")
                );

                lista.add(p);
            }
            
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar produtos");
        }

        return lista;
    }
}

