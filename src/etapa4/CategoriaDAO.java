package etapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CategoriaDAO {
  
    public ArrayList<Categoria> listar() {
        ArrayList<Categoria> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM categoria";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria c = new Categoria(
                        rs.getInt("id"),
                        rs.getString("nome")
                );

                lista.add(c);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar categorias: " + e.getMessage());
        }

        return lista;
    } 
}
