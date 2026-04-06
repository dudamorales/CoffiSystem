package etapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PromocaoDAO {

    public void inserir(Promocao p) {
        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO promocao (idProduto, porcentagem, validade) VALUES (?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, p.getIdProduto());
            stmt.setDouble(2, p.getPorcentagemDesc());
            stmt.setString(3, p.getDataValidade());

            stmt.executeUpdate();

            
            stmt.close();
            conn.close();

            System.out.println("Promoção cadastrada!");

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar promoção: " + e.getMessage());
        }
    }

   
    public ArrayList<Promocao> listar() {
        ArrayList<Promocao> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM promocao";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Promocao p = new Promocao(
                        rs.getInt("id"),
                        rs.getInt("idProduto"),
                        rs.getDouble("porcentagem"),
                        rs.getString("validade")
                );

                lista.add(p);
            }

            
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar promoções: " + e.getMessage());
        }

        return lista;
    } 
    
    public void atualizar(Promocao p) {
    try {
        Connection conn = Conexao.conectar();

        String sql = "UPDATE promocao SET porcentagem = ?, validade = ? WHERE id = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setDouble(1, p.getPorcentagemDesc());
        stmt.setString(2, p.getDataValidade());
        stmt.setInt(3, p.getIdPromocao());

        stmt.executeUpdate();

        stmt.close();
        conn.close();

    } catch (Exception e) {
        System.out.println("Erro ao atualizar promoção: " + e.getMessage());
    }
}
}
