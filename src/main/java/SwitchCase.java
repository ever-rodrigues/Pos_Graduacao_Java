public class SwitchCase {
    public static void main(String[] args) {
        int valor = (int)(Math.random()*5);
        switch (valor){
            case 0:
                System.out.println("Primeira opacao (Valor igual a zero)"+valor);
                break;
            case 1:
                System.out.println("Primeira opacao (Valor igual a Um)"+valor);
                break;
            case 2:
                System.out.println("Primeira opacao (Valor igual a Dois)"+valor);
                break;
            default:
                System.out.println("Outras opcoes de valores, valor = "+valor);
        }
    }
}
