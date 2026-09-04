package Atividade01092026;

public class Projeto {
    private String nome;
    private String descricao;
    private Desenvolvedor desenvolvedor;

    public Projeto(String nome, String descricao, Desenvolvedor desenvolvedor){
        this.nome = nome;
        this.descricao = descricao;
        this.desenvolvedor = desenvolvedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }
    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    @Override
    public String toString(){
        return "NOME DO PROJETO: "+nome+" | DESCRIÇÃO DO PROJETO: "+descricao+" | DESENVOLVEDOR DO PROJETO: "+desenvolvedor;
    }
}
