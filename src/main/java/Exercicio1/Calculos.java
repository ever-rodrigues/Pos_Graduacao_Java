package Exercicio1;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculos {
    private int a;
    private int b;

    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(reader);

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }

    public int menu() throws IOException {
        int escolha=0;
        System.out.println("Menu Opcoes:\n"
                + "1-Somar (a+b)\n"
                + "2-Multiplicar (a*b)\n"
                + "3-Subtrair (a-b)\n"
                + "4-Dividir (a/b)\n"
                + "Escolha uma Opcao:"
        );
        try{
            escolha= Integer.parseInt(buffer.readLine());
        }
        catch (IOException e){
            System.out.println("Erro de leitura");
        }
        catch (NumberFormatException error){
            System.out.println("Erro de formato digitado ->"+error);
        }
        return escolha;
    }

    public void entradaDados() throws IOException {
        System.out.println("Digite um valor para entrada para a:");
        try {
            this.a=Integer.parseInt(buffer.readLine());
        }catch (NumberFormatException error){
            System.out.println("Erro esperado um numero inteiro!");
            System.out.println("Valor deferido para a=0");
        }
        System.out.println("Digite um valor para entrada para b:");
        try {
            this.b=Integer.parseInt(buffer.readLine());
        }catch (NumberFormatException error2){
            System.out.println("Erro esperado um numero inteiro!");
            System.out.println("Valor deferido para b=0");
        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}