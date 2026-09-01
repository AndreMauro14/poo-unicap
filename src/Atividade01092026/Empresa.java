package Atividade01092026;

import java.util.ArrayList;

public class Empresa {
    private Gerente gerente;
    private ArrayList<Projeto> projetos;

    public Empresa(Gerente gerente) {
        projetos = new ArrayList<>();
        this.gerente = gerente;
    }

    public Gerente getGerente(){
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void addProjetos(Projeto p) {
        this.projetos.add(p);
    }
}