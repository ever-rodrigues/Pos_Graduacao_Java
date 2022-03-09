import java.io.*;
public class pratica01 {
    public static void main(String[] args) throws IOException {
        String nome="";
        String idade;
        String cpf;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer= new BufferedReader(input);

        System.out.println("Digite seu nome:");
        nome=buffer.readLine();
        System.out.println("Digite sua idade:");
        idade=buffer.readLine();
        System.out.println("Digite seu cpf:");
        cpf=buffer.readLine();
        System.out.printf("Meu nome é: %s com idade %s e numero cpf %s",nome,idade,cpf);

    }
}
