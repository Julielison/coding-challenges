package BEE1557;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int ordem;
        while ((ordem = scanner.nextInt()) != 0){
            int[][] matriz = new int[ordem][ordem];
            int valor_base = 1;
            for (int i = 0; i < ordem; i++){
                int atual = valor_base;
                for (int j = 0; j < ordem; j++){
                    matriz[i][j] = atual;
                    atual *= 2;
                }
                valor_base *= 2;
            }
            int ultimo = ordem - 1;
            int maior = matriz[ultimo][ultimo];
            int largura = String.valueOf(maior).length();

            for (int[] linha : matriz) {
                for (int j = 0; j < linha.length; j++) {
                    if (j == linha.length - 1) {
                        System.out.printf("%" + largura + "d", linha[j]);
                    } else {
                        System.out.printf("%" + largura + "d ", linha[j]);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        scanner.close();
    }
}
