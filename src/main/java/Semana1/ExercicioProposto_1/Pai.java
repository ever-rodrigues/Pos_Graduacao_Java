package Semana1.ExercicioProposto_1;

public class Pai {

    private int rgPai;
    private String nomePai;
    private Filho filho;


    public Pai(int rgPai, String nomePai, Filho filhoPai) {
        this.rgPai = rgPai;
        this.nomePai = nomePai;
        this.filho = filhoPai;
    }

    public Pai() {
        this.rgPai = 0;
        this.nomePai = " ";
        filho = new Filho();
    }

    public int getRgPai() {
        return rgPai;
    }

    public void setRgPai(int rgPai) {
        this.rgPai = rgPai;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Filho getFilhoPai() {
        return filho;
    }

    public void setFilhoPai(Filho filhoPai) {
        this.filho = filhoPai;
    }
}
