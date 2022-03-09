public class SelecaoTernario {
    public static void main(String[] args) {
        //Interrogacao  ? e igual a if
        //<variavel> = (condicao) SE <valor1> : <valor2>
        //<variavel> = (True) SE <valor1> SENAO <valor2>
        //int c = (true) ? 5 : 2 ;
        //Ou seja se a>b retorna a, senao retorna b;
        int a=5,b=2,c=(a>b ? a : b);
        System.out.println(c);
    }
}
