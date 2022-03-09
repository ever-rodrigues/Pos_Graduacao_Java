public class Calculando{
    int valor1;
    int valor2;
    public int Soma(int valor1, int valor2) {
        return valor1+valor2;
    }
    public int Multiplicacao(int valor1, int valor2) {
        return valor1*valor2;
    }
    public int Divisao(int valor1, int valor2) {
        return valor1/valor2;
    }
    public int Subtracao(int valor1, int valor2) {
        return valor1-valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public Calculando(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
}
