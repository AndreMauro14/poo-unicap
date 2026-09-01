package AulaHeranca;

public class ClienteMain {
    public static void main (String[] args) {
        ClientePJ cPJ = new ClientePJ("Daniel", "Rua do Principe", "2222222222222");

        ClientePF cPF = new ClientePF("Gustavo Bobão", "Encruzilhada", "9000999");

        System.out.println("Nome: "+cPJ.getNome()+ ", Endereco: "+ cPJ.getEndereco()+ ", CNPJ: "+ cPJ.getCnpj());
        System.out.println("Nome: "+cPF.getNome()+ ", Endereco: "+ cPF.getEndereco()+ ", CNPJ: "+ cPF.getCpf());

    }
}
