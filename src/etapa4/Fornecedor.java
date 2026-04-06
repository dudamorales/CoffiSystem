package etapa4;


public class Fornecedor {
   private int idFornecedor;
   private String nomeCompleto;
   private String empresa;
   private String telefone1;
   private String telefone2;
   private String email;

    public Fornecedor(int idFornecedor, String nomeCompleto, String empresa, String telefone1, String telefone2, String email) {
        this.idFornecedor = idFornecedor;
        this.nomeCompleto = nomeCompleto;
        this.empresa = empresa;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
    return nomeCompleto;
    }
}
