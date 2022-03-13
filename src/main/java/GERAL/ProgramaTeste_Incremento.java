package GERAL;

public class ProgramaTeste_Incremento {
    public static void main(String[] args) {
        //++x Pré-incremento Incrementa X em um, e então retorna X.
        //x++ Pós-incremento Retorna X, e então incrementa X em um.
        int a=4;
        int b=a++;
        //x++ - primeiro faz o uso da variavel
        int c=++a;
        //++a - primeiro faz a operacao
        System.out.println(b);
        System.out.println(c);
    }
}
