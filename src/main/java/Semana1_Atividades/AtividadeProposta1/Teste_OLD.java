package Semana1_Atividades.AtividadeProposta1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Teste_OLD {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        LinkedHashSet<Veiculo> meusVeiculos = new LinkedHashSet<>();
        System.out.println("<---------- Bem vindo a criacao de Veiculos! ---------->\n");
        for(int i =0;i<2;i++){
            Veiculo meuVeiculo = new Veiculo();
            meuVeiculo.setMotor(new Motor());
            System.out.println("Digite a marca do veiculo que deseja criar:");
            meuVeiculo.setMarca(buffer.readLine());
            System.out.printf("Da marca %s digite seu modelo:\n",meuVeiculo.getMarca());
            meuVeiculo.setModelo(buffer.readLine());
            System.out.printf("Digite a placa de seu %s :\n",meuVeiculo.getModelo());
            meuVeiculo.setPlaca(buffer.readLine());
            System.out.printf("Digite a cor de seu %s :\n",meuVeiculo.getModelo());
            meuVeiculo.setCor(buffer.readLine());
            System.out.printf("Digite a velocidade maxima de seu %s :\n",meuVeiculo.getModelo());
            meuVeiculo.setVelocMax(scan.nextFloat());
            System.out.printf("Digite quantas rodas seu %s possui:\n",meuVeiculo.getModelo());
            meuVeiculo.setQtdRodas(scan.nextInt());
            System.out.printf("Digite quantas de pistoes seu %s possui:\n",meuVeiculo.getModelo());
            meuVeiculo.getMotor().setQtdPist(scan.nextInt());
            System.out.printf("Digite a potencia de seu %s:\n",meuVeiculo.getModelo());
            meuVeiculo.getMotor().setPotencia(scan.nextInt());
            meusVeiculos.add(meuVeiculo);
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("<---------- Impressao de detalhes de seus Veiculos criados: ---------->");
        for (Veiculo item:meusVeiculos
             ) {
            System.out.println("\n");
            System.out.println(item);
        }


//
//
//        System.out.printf("<------------ Imprimindo detalhes do meu %s ------------>\n",meuHonda.getModelo());
//        System.out.println(meuHonda+"\n");
//
//        Veiculo meuPeugeot = new Veiculo();
//        meuPeugeot.setMarca("Peugeot");
//        meuPeugeot.setModelo("206 Escapade");
//        meuPeugeot.setPlaca("LPS6822");
//        meuPeugeot.setCor("Verde");
//        meuPeugeot.setQtdRodas(4);
//        meuPeugeot.setVelocMax(180);
//        Motor motor16 = new Motor(16,220);
//        meuPeugeot.setMotor(motor16);
//        System.out.printf("<------------ Imprimindo detalhes do meu %s ------------> \n",meuPeugeot.getModelo());
//        System.out.println(meuPeugeot);

    }
}
