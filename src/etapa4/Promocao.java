package etapa4;


public class Promocao {
   private int idPromocao;
   private int idProduto;
   private double porcentagemDesc;
   private String dataValidade;

    public Promocao(int idPromocao, int idProduto, double porcentagemDesc, String dataValidade) {
        this.idPromocao = idPromocao;
        this.idProduto = idProduto;
        this.porcentagemDesc = porcentagemDesc;
        this.dataValidade = dataValidade;
    }

    public int getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(int idPromocao) {
        this.idPromocao = idPromocao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPorcentagemDesc() {
        return porcentagemDesc;
    }

    public void setPorcentagemDesc(double porcentagemDesc) {
        this.porcentagemDesc = porcentagemDesc;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    @Override
    public String toString() {
        return porcentagemDesc + "%";
    }
}
