package Semana1.ExercicioProposto_1;

public class Filho {

    private int rgFilho;
    private String nomeFilho;


    public Filho(int rgFilho, String nomeFilho) {
        this.rgFilho = rgFilho;
        this.nomeFilho = nomeFilho;
    }

    public Filho(){
        this.rgFilho = 0;
        this.nomeFilho = " ";
    }

    public int getRgFilho() {
        return rgFilho;
    }

    public void setRgFilho(int rgFilho) {
        this.rgFilho = rgFilho;
    }

    public String getNomeFilho() {
        return nomeFilho;
    }

    public void setNomeFilho(String nomeFilho) {
        this.nomeFilho = nomeFilho;
    }
}
