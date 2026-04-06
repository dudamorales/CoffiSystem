
package etapa3;


public class Produto {
 private int idProduto;
 private String nomeProd;
 private double valor;
 private int quantidadeEstoque;
 private String validade;
 private int idCategoria;
 private int idFornecedor;

    public Produto(int idProduto, String nomeProd, double valor, int quantidadeEstoque, String validade, int idCategoria, int idFornecedor) {
        this.idProduto = idProduto;
        this.nomeProd = nomeProd;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.validade = validade;
        this.idCategoria = idCategoria;
        this.idFornecedor = idFornecedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    
    @Override
    public String toString() {
        return nomeProd;
    }
    
   
        
}
