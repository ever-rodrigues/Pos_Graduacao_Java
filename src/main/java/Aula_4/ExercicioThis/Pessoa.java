package Aula_4.ExercicioThis;

public class Pessoa {
    int rg;
    String nome;

    public void insereDados() {
        int rg = 1;
        String nome = "Jesus";
        this.rg = rg;
        this.nome = nome;
    }

    public void mostraDados() {
        System.out.println("\n RG: " + rg);
        System.out.println("\n Nome: " + nome);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.insereDados();
        p.mostraDados();

    }
}