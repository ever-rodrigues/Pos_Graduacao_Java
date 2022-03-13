package Livro_Java_Iniciantes.Finalize;

class Fdemo{
    int x;

    Fdemo (int i){
        x=i;
    }

    protected  void finalize(){
        System.out.printf("Finalizando.. %d \n", x);
    }
    void generator(int i){
        Fdemo o = new Fdemo(i);
    }

}

public class Finalize {
    public static void main(String[] args) {
        int cout;
        Fdemo ob= new Fdemo(0);
        for(cout =0;cout<1000000;cout++){
            ob.generator(cout);
        }



    }
}
