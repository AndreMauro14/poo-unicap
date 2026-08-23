package Pessoa;

public class Pessoa {
    String nome;
    Integer idade;
    String cpf;
    float dist;

    Pessoa(String nome, Integer idade, String cpf, float dist){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dist = dist;
    }
    float andar (float distPer){
        dist+=distPer;
        return dist;
    }
}
