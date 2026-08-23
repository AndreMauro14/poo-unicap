package Pessoa;

public class Main {
    public static void main(String[] args) {
    Pessoa p = new Pessoa("Guga",22,"12345678-90", 0);

        System.out.println(p.nome+" tem "+p.idade+" anos e andou "+p.dist+" km");

        p.andar(2);

        System.out.println(p.nome+" tem "+p.idade+" anos e andou "+p.dist+" km");

    }
}