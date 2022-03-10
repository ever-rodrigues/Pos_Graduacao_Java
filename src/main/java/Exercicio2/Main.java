package Exercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        boolean condicao=true;
        while(condicao){
            try{
                System.out.println("Digite um valor:");
                int valor=Integer.parseInt(buffer.readLine());
                if(valor%2==0){
                    System.out.println("Numero e par!");
                    condicao=false;
                }
                else
                    System.out.println("Numero e impar!");
                    condicao=false;
            }catch (NumberFormatException error){
                System.out.println("Valor digitado nao e inteiro!");

            }
        }


    }
}
