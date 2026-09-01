package Atividade01092026;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor (String nome, String cpf, Float salario, String linguagemPrincipal){
        super(nome,cpf,salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    public void setDepartamento(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
}

