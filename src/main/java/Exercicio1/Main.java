package Exercicio1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int escolha;
        System.out.println("PROGRAMA RODANDO>>>>>>");
        Calculos meuCalculo=new Calculos();
        meuCalculo.entradaDados();
        escolha = meuCalculo.menu();
        switch (escolha){
            case 1:
                System.out.println("Opcao Soma:");
                System.out.println(meuCalculo.soma(meuCalculo.getA(), meuCalculo.getB()));
                break;
            case 2:
                System.out.println("Opcao Multiplicacao:");
                System.out.println(meuCalculo.multiplicacao(meuCalculo.getA(), meuCalculo.getB()));
                break;
            case 3:
                System.out.println("Opcao Subtracao:");
                System.out.println(meuCalculo.subtracao(meuCalculo.getA(), meuCalculo.getB()));
                break;
            case 4:
                System.out.println("Opcao Divisao:");
                System.out.println(meuCalculo.divisao(meuCalculo.getA(), meuCalculo.getB()));
                break;
            default:
                System.out.println("Valores nao correspndem as escolhas");
                break;
        }
    }
}
