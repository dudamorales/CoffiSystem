package etapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FuncionarioDAO {
   
    public void inserir(Funcionario f) {
        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO funcionario (nome, dataNascimento, cpf, email, endereco) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getDataNascimento());
            stmt.setString(3, f.getCpf());
            stmt.setString(4, f.getEmail());
            stmt.setString(5, f.getEndereco());

            stmt.executeUpdate();

            System.out.println("Funcionário inserido com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao inserir funcionário: " + e.getMessage());
        }
    }

    public ArrayList<Funcionario> listar() {
        ArrayList<Funcionario> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM funcionario";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("dataNascimento"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("endereco")
                );

                lista.add(f);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar funcionários: " + e.getMessage());
        }

        return lista;
    }

}

 