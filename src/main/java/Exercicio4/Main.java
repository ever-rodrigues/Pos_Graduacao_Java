package Exercicio4;

public class Main {
    public static void main(String[] args) {
        String frase="Eis-me aqui SENHOR, envia-me a miM";
        System.out.println("\t\t\t\t Eis-me aqui SENHOR, envia-me a mim");
        System.out.println("\n\n A frase anterior tem "+frase.length()+" caracteres");
        System.out.println("\n\n Transformando-a toda em MAIUSCULA:");
        System.out.print(frase.toUpperCase());
        System.out.println("\n\n TRANSFORMANDO-A TODA EM minuscula:");
        System.out.print(frase.toLowerCase());
        System.out.println("\n\n Procurando a letra da 10 posição:");
        System.out.print(frase.charAt(13));
        System.out.println("\n\n Retornando a substring dentro da frase:");
        System.out.println(frase.substring(0,11));
        System.out.println("\n\n 1ª Vez que encontrou a letra 'O' na frase:");
        System.out.println(frase.indexOf('O'));
        System.out.println("\n\n Tirando os espaços em branco:");
        System.out.println(frase.trim());
        System.out.println("\n\n Trocando as letras 'm' por 'M':");
        System.out.println(frase.replace('m','M'));
        System.out.println("\n\n Compara frases:");
        System.out.println(frase.compareTo("M"));
    }
}
