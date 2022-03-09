public class Pratica02_Aritmeticos {
    public static void main(String[] args) {
        System.out.println("Impressao de Resultados de Calculos:");
        Calculando calculo= new Calculando(5,10);
        System.out.printf("Soma %d + %d = %d \n",calculo.getValor1(),calculo.getValor2(),calculo.Soma(calculo.getValor1(),calculo.getValor2()));
        System.out.printf("Multiplicacao %d * %d = %d \n",calculo.getValor1(),calculo.getValor2(),calculo.Multiplicacao(calculo.getValor1(),calculo.getValor2()));
        System.out.printf("Divisao %d / %d = %d \n",calculo.getValor1(),calculo.getValor2(),calculo.Divisao(calculo.getValor1(),calculo.getValor2()));
        System.out.printf("Subtracao %d - %d = %d \n",calculo.getValor1(),calculo.getValor2(),calculo.Subtracao(calculo.getValor1(),calculo.getValor2()));

    }
}

