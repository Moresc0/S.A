package projetosa;
public class Aluno {
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private int datansc;
    

    public Aluno() {
    }

    public Aluno(String nome, String email, String senha, String cpf, int datansc) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.datansc = datansc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDatansc() {
        return datansc;
    }

    public void setDatansc(int datansc) {
        this.datansc = datansc;
    }
}
