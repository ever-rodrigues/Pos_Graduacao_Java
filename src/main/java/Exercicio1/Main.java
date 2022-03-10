package Exercicio1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int escolha;
        System.out.println("<<<<<<<PROGRAMA RODANDO>>>>>>");
        Calculos meuCalculo=new Calculos();
        meuCalculo.entradaDados();
        escolha = meuCalculo.menu();
        switch (escolha){
            case 1:
                System.out.printf("A soma de a + b é:");
                System.out.printf("%d",meuCalculo.soma(meuCalculo.getA(), meuCalculo.getB()));
                break;
            case 2:
                System.out.printf("A multiplicacao de a * b é:");
                System.out.printf("%d",meuCalculo.multiplicacao(meuCalculo.getA(), meuCalculo.getB()));
                break;
            case 3:
                System.out.printf("A subtracao de a - b é:");
                System.out.printf("%d ",meuCalculo.subtracao(meuCalculo.getA(), meuCalculo.getB()));
                break;
            case 4:
                System.out.printf("A divisao de a / b é:");
                System.out.printf("%d ",meuCalculo.divisao(meuCalculo.getA(), meuCalculo.getB()));
                break;
            default:
                System.out.println("Valores nao correspndem as escolhas");
                break;
        }
    }
}
