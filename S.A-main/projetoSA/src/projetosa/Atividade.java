package projetosa;

public class Atividade {
    
    private String nome;
    private String des;

    public Atividade() {
    }

    public Atividade(String nome, String des) {
        this.nome = nome;
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
