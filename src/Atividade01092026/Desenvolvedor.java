package Atividade01092026;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor (String nome, String cpf, double salario, String linguagemPrincipal){
        super(nome,cpf,salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    public void setDepartamento(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public String toString() {
        return "O DEV: "+super.getNome()+" DO CPF: "+super.getCpf()+ " | USA A LINGUAGEM: "+getLinguagemPrincipal()+ " | GANHA: "+super.getSalario();
    }


}

