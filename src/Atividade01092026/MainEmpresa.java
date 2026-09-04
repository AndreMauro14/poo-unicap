package Atividade01092026;

public class MainEmpresa {
    public static void main(String[]args){
        Desenvolvedor dev = new Desenvolvedor("Mateus","7157186969",1000,"Java");
        Gerente gerente = new Gerente("André", "714750000",89999,"Desenvolvimento");
        Projeto projeto = new Projeto("POO", "AULA DE DANIEL",dev);
        Empresa emp = new Empresa(gerente);

        emp.addProjetos(projeto);

        System.out.println(emp);

        Desenvolvedor dev2 = new Desenvolvedor("Silas","09102913823",10001,"JS");
        Projeto projeto2 = new Projeto("AULA POO 2", "AULA DE DANIEL",dev2);
        Empresa emp2 = new Empresa(gerente);

        emp2.addProjetos(projeto2);

        System.out.println(emp2);
    }
}
