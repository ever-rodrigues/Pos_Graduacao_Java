package GERAL;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Matriz_Teste {
    public static void main(String[] args) {
        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(tec);
        String capture= "";
        int qtdLinhas=2, qtdColunas=2,linha=0,coluna=0,ctrLinha=0,ctrColun=0;
        int[][] matriz =new int [qtdLinhas][qtdColunas];
        for (int l=0;l<qtdLinhas;l++) {
            linha = l;
            for (int c = 0; c < qtdColunas; c++) {
                coluna = c;
                System.out.println("\n Entre com o valor para a posicao [" + l + "," + c + "] da matriz");
                try {
                    capture = buffer.readLine();
                } catch (IOException ioe) {
                    System.out.println(" \n Erro De Sistema");
                }
                int val = Integer.parseInt(capture);
                matriz[l][c] = val;
            }
        }
            System.out.println("\n Impressao Inversa: \n");
            ctrColun=coluna;
            for (int k=0;k<=linha;linha--){
                for(int m=0;m<=coluna;coluna--){
                    System.out.println(matriz[linha][coluna]);
                }
                coluna=ctrColun;
            }
        }
    }