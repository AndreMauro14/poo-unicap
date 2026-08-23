package Atividade1;

public class MainFilme {
    public static void main(String[] args){
        Filme filme = new Filme("Interestelar", "Ficção Cientifica", 2014);
        Filme filme2 = new Filme("Toy Story", "Animação", 1995);

        System.out.println("Filme: "+ filme.getTitulo()+", gênero: "+filme.getGenero()+", Ano de Lançamento: "+filme.getAnoLancamento());
        System.out.println("Filme: "+ filme2.getTitulo()+", gênero: "+filme2.getGenero()+", Ano de Lançamento: "+filme2.getAnoLancamento());
    }
}
