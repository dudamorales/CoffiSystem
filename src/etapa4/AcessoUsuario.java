package etapa4;


public class AcessoUsuario {
 private String cpf;
 private String senha;
 private String tipoUsuario;


public AcessoUsuario(String cpf, String senha, String tipoUsuario) {
        this.cpf = cpf;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}
