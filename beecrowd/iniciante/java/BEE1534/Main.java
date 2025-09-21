package BEE1534;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "BEE1534.Main" para que a sua solução execute
 *      Class name must be "BEE1534.Main" for your solution to execute
 *      El nombre de la clase debe ser "BEE1534.Main" para que su solución ejecutar
 */
public class Main {
    /*
    O 2 está indo pra direita
    O 1 pra esquerda
    Linha 1: sempre 1...2 (3 no meio)
    */

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            List<String> linhaNumeros = new ArrayList<>(Collections.nCopies(n, "3"));
            linhaNumeros.set(0, "1");
            linhaNumeros.set(linhaNumeros.size() - 1, "2");

            int dois = linhaNumeros.size()-1;
            int um = 0;
            System.out.println(String.join("", linhaNumeros));
            for (int i = 1; i < n; i++){

                // Quando a diferença entre eles for igual a 2
                if (dois - um == 2){
                    Collections.swap(linhaNumeros, dois, dois-1);
                    linhaNumeros.set(um, "3");
                } else if (n % 2 != 0 && linhaNumeros.get(n/2).equals("2")) {
                    Collections.swap(linhaNumeros, dois, dois - 1);
                    linhaNumeros.set(n / 2 + 1, "1");
                } else if (dois - um == 1) {
                    Collections.swap(linhaNumeros, dois, dois-1);
                } else {
                    Collections.swap(linhaNumeros, dois, dois-1);
                    Collections.swap(linhaNumeros, um, um+1);
                }
                System.out.println(String.join("", linhaNumeros));
                um++;
                dois--;
            }
        }
        scanner.close();
    }

}