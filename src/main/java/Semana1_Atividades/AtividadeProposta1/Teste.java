package Semana1_Atividades.AtividadeProposta1;

import java.io.IOException;
import java.util.LinkedHashSet;

public class Teste {

    public static void main(String[] args) throws IOException {
        LinkedHashSet<Veiculo> meusVeiculos = new LinkedHashSet<>();
        Veiculo veiculo01 = new Veiculo();
        Veiculo veiculo02 = new Veiculo();
        Veiculo veiculo03 = new Veiculo();
        Veiculo veiculo04 = new Veiculo();
        Veiculo veiculo05 = new Veiculo();

        veiculo01.setMarca("Honda");
        veiculo01.setModelo("Honda Fit");
        veiculo01.setPlaca("LPS4578");
        veiculo01.setCor("Cinza");
        veiculo01.setQtdRodas(4);
        veiculo01.setVelocMax(220);
        veiculo01.setMotor(new Motor(8,200));

        System.out.println("Imprimindo pelo metodo GET:\n");
        System.out.println("Marca: "+veiculo01.getMarca());
        System.out.println("Modelo: "+veiculo01.getModelo());
        System.out.println("Placa: "+veiculo01.getPlaca());
        System.out.println("Cor: "+veiculo01.getCor());
        System.out.println("Qtd Rodas: "+veiculo01.getQtdRodas());
        System.out.printf("Vel Max: %.2f Km/h \n",veiculo01.getVelocMax());
        System.out.println("Qtd Pistao: "+veiculo01.getMotor().getQtdPist());
        System.out.printf("Potencia: %d cavalos \n",veiculo01.getMotor().getPotencia());

        veiculo02.setMarca("Peugeot");
        veiculo02.setModelo("206 Escapade");
        veiculo02.setPlaca("SAD1212");
        veiculo02.setCor("Verde");
        veiculo02.setQtdRodas(4);
        veiculo02.setVelocMax(200);
        veiculo02.setMotor(new Motor(8,160));

        System.out.println("\n");
        System.out.println("Marca: "+veiculo02.getMarca());
        System.out.println("Modelo: "+veiculo02.getModelo());
        System.out.println("Placa: "+veiculo02.getPlaca());
        System.out.println("Cor: "+veiculo02.getCor());
        System.out.println("Qtd Rodas: "+veiculo02.getQtdRodas());
        System.out.printf("Vel Max: %.2f Km/h \n",veiculo02.getVelocMax());
        System.out.println("Qtd Pistao: "+veiculo02.getMotor().getQtdPist());
        System.out.printf("Potencia: %d cavalos \n",veiculo02.getMotor().getPotencia());


        veiculo03.setMarca("Peugeot");
        veiculo03.setModelo("306 ");
        veiculo03.setPlaca("UTR3232");
        veiculo03.setCor("Azul");
        veiculo03.setQtdRodas(4);
        veiculo03.setVelocMax(240);
        veiculo03.setMotor(new Motor(8,220));

        System.out.println("\n");
        System.out.println("Marca: "+veiculo03.getMarca());
        System.out.println("Modelo: "+veiculo03.getModelo());
        System.out.println("Placa: "+veiculo03.getPlaca());
        System.out.println("Cor: "+veiculo03.getCor());
        System.out.println("Qtd Rodas: "+veiculo03.getQtdRodas());
        System.out.printf("Vel Max: %.2f Km/h \n",veiculo03.getVelocMax());
        System.out.println("Qtd Pistao: "+veiculo03.getMotor().getQtdPist());
        System.out.printf("Potencia: %d cavalos \n",veiculo03.getMotor().getPotencia());



        veiculo04.setMarca("Honda");
        veiculo04.setModelo("Honda City");
        veiculo04.setPlaca("AAX1982");
        veiculo04.setCor("Cinza Grafite");
        veiculo04.setQtdRodas(4);
        veiculo04.setVelocMax(210);
        veiculo04.setMotor(new Motor(8,216));

        System.out.println("Imprimindo pelo metodo GET:\n");
        System.out.println("Marca: "+veiculo04.getMarca());
        System.out.println("Modelo: "+veiculo04.getModelo());
        System.out.println("Placa: "+veiculo04.getPlaca());
        System.out.println("Cor: "+veiculo04.getCor());
        System.out.println("Qtd Rodas: "+veiculo04.getQtdRodas());
        System.out.printf("Vel Max: %.2f Km/h \n",veiculo04.getVelocMax());
        System.out.println("Qtd Pistao: "+veiculo04.getMotor().getQtdPist());
        System.out.printf("Potencia: %d cavalos \n",veiculo04.getMotor().getPotencia());


        veiculo05.setMarca("Fiat");
        veiculo05.setModelo("Uno Millie");
        veiculo05.setPlaca("UUZ0245");
        veiculo05.setCor("Branco");
        veiculo05.setQtdRodas(2);
        veiculo05.setVelocMax(180);
        veiculo05.setMotor(new Motor(8,160));

        System.out.println("Imprimindo pelo metodo GET:\n");
        System.out.println("Marca: "+veiculo05.getMarca());
        System.out.println("Modelo: "+veiculo05.getModelo());
        System.out.println("Placa: "+veiculo05.getPlaca());
        System.out.println("Cor: "+veiculo05.getCor());
        System.out.println("Qtd Rodas: "+veiculo05.getQtdRodas());
        System.out.printf("Vel Max: %.2f Km/h \n",veiculo05.getVelocMax());
        System.out.println("Qtd Pistao: "+veiculo05.getMotor().getQtdPist());
        System.out.printf("Potencia: %d cavalos \n",veiculo05.getMotor().getPotencia());


        meusVeiculos.add(veiculo01);
        meusVeiculos.add(veiculo02);
        meusVeiculos.add(veiculo03);
        meusVeiculos.add(veiculo04);
        meusVeiculos.add(veiculo05);

        System.out.println("\n");
        System.out.println("<---------- Impressao de detalhes de seus Veiculos criados e adicionados a uma lista: ---------->");
        for (Veiculo item:meusVeiculos
             ) {
            System.out.println("\n");
            System.out.println(item);
        }
    }
}
