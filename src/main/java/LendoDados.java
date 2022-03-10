import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;

public class LendoDados {
    public static void main(String[] args) {
        System.out.println("Digite um valor:");
        InputStreamReader reader= new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String s="";
        try{
            s=buffer.readLine();
            int dadoInt=Integer.parseInt(s);
        }catch (IOException e){
            System.out.println("Erro de leitura");
        }
        catch (NumberFormatException error){
            System.out.println("Erro de conversao de dados"+ error);
        }
        System.out.println("O valor de entrada foi:"+s);
    }
}
