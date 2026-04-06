
package etapa4;

import java.util.ArrayList;


public class Dados {
    public static ArrayList<Produto> listaProdutos = new ArrayList<>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static ArrayList<Venda> listaVendas = new ArrayList<>();
    public static ArrayList<AcessoUsuario> listaUsuarios = new ArrayList<>();
    public static ArrayList<Promocao> listaPromocoes = new ArrayList<>();
    public static ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    public static ArrayList<Categoria> listaCategorias = new ArrayList<>();
    static {
        listaCategorias.add(new Categoria(1, "Skincare"));
        listaCategorias.add(new Categoria(2, "Maquiagem"));
        listaCategorias.add(new Categoria(3, "Limpeza de Pele"));
    }
}
