package etapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO {

    public void inserir(Cliente c) {
        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefone());

            stmt.executeUpdate();
            stmt.close();
            conn.close();

            System.out.println("Cliente inserido com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM cliente";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("telefone")
                );

                lista.add(c);
            }
            
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
        }

        return lista;
    }
    public Cliente pegarUltimoCliente() {
    try {
        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM cliente ORDER BY id DESC LIMIT 1";

        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Cliente c = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("telefone")
            );

            rs.close();
            stmt.close();
            conn.close();

            return c;
        }

    } catch (Exception e) {
        System.out.println("Erro ao pegar último cliente: " + e.getMessage());
    }

    return null;
}
}
