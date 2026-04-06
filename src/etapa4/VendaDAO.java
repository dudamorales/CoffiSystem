package etapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VendaDAO {
   
    public void inserir(Venda v) {
        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO venda (idProduto, idCliente, quantidade, valorTotal) VALUES (?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, v.getIdProduto());
            stmt.setInt(2, v.getIdCliente());
            stmt.setInt(3, v.getQuantidade());
            stmt.setDouble(4, v.getValorTotal());

            stmt.executeUpdate();
            stmt.close();
            conn.close();

            System.out.println("Venda cadastrada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar venda: " + e.getMessage());
        }
    }

    
    public ArrayList<Venda> listar() {
        ArrayList<Venda> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM venda";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda v = new Venda(
                        rs.getInt("id"),
                        rs.getInt("idProduto"),
                        rs.getInt("idCliente"),
                        rs.getInt("quantidade"),
                        rs.getDouble("valorTotal")
                );

                lista.add(v);
            }

            
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar vendas: " + e.getMessage());
        }

        return lista;
    }
}
