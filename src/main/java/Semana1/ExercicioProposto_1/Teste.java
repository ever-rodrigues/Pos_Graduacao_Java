package Semana1.ExercicioProposto_1;

public class Teste {
    public static void main(String[] args) {
        Filho meuFilho = new Filho(44545,"Larissa Kaniak Ikeda");
        Pai meuPai = new Pai(45454,"Minoru Ikeda",meuFilho);

        System.out.println(meuFilho.getNomeFilho());
        System.out.println(meuPai.getNomePai());
    }
}
