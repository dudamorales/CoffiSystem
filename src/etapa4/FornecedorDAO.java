package etapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FornecedorDAO {
  
    public void inserir(Fornecedor f) {
        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO fornecedor (nome, empresa, telefone1, telefone2, email) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, f.getNomeCompleto());
            stmt.setString(2, f.getEmpresa());
            stmt.setString(3, f.getTelefone1());
            stmt.setString(4, f.getTelefone2());
            stmt.setString(5, f.getEmail());

            stmt.executeUpdate();

            System.out.println("Fornecedor inserido com sucesso!");
            
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao inserir fornecedor: " + e.getMessage());
        }
    }

   
    public ArrayList<Fornecedor> listar() {
        ArrayList<Fornecedor> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM fornecedor";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedor f = new Fornecedor(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("empresa"),
                        rs.getString("telefone1"),
                        rs.getString("telefone2"),
                        rs.getString("email")
                );

                lista.add(f);
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao listar fornecedores: " + e.getMessage());
        }

        return lista;
    }
}

