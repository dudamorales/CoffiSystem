package etapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoUsuarioDAO {
      public void inserir(AcessoUsuario u) {
    try {
        Connection conn = Conexao.conectar();

        String sql = "INSERT INTO usuario (cpf, senha, tipo) VALUES (?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, u.getCpf());
        stmt.setString(2, u.getSenha());
        stmt.setString(3, u.getTipoUsuario());

        stmt.executeUpdate();

        stmt.close();
        conn.close();

    } catch (Exception e) {
        System.out.println("Erro ao inserir usuário: " + e.getMessage());
    }   
 }
      public AcessoUsuario validarLogin(String cpf, String senha) {

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM usuario WHERE cpf = ? AND senha = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                AcessoUsuario user = new AcessoUsuario(
                        rs.getString("cpf"),
                        rs.getString("senha"),
                        rs.getString("tipo")
                );

                return user;
                
            }
            
             rs.close();
             stmt.close();
             conn.close();
             
        } catch (Exception e) {
            System.out.println("Erro no login: " + e.getMessage());
        }

        return null;
    }
}

