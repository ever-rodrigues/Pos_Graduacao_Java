package Exercicio7;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main{
    public static void main(String[] args) throws IOException {
        System.out.println("Digite uma frase");
        InputStreamReader reader= new InputStreamReader(System.in);
        BufferedReader buffer= new BufferedReader(reader);
        String minnaString=buffer.readLine();
        System.out.printf("Escolha uma letra da sua frase: %s \n",minnaString);
        String charEscolhido;
        String StringEscolhido=buffer.readLine();
        System.out.printf("Letra escolhida:%s \n",StringEscolhido);
        String upper = StringEscolhido.toUpperCase();
        String lower = StringEscolhido.toLowerCase();
        char meucharupper = StringEscolhido.toUpperCase().charAt(0);
        char meucharlower = StringEscolhido.toLowerCase().charAt(0);
        int cont=0;
        for(int i=0;i<minnaString.length();i++){
            char temp=minnaString.charAt(i);
//            System.out.println(temp);
                if(temp==meucharlower){
//                    System.out.println("Posicao na frase:"+minnaString.charAt(i));
                    System.out.println("Posicao na frase:"+(minnaString.indexOf(temp,i)+1));
                    //System.out.println(temp);
                    cont++;
                }
                if(temp==meucharupper){
//                    System.out.println("Posicao na frase:"+minnaString.charAt(i));
                    System.out.println("Posicao na frase:"+(minnaString.indexOf(temp,i)+1));
                    //System.out.println(temp);
                    cont++;
                }
            }
        if(cont>0){
            System.out.println("Numero total de aparicoes:"+cont);
        }
        else {
            System.out.println("Essa letra nao existe na frase");
        }
    }
}
