package BEE1541;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        /*
        Multiplica os dois primeiros, multiplica por 100
        Divide pelo 3º
        Calcula a raiz quadrada e arrendonda pra baixo
         */

        Scanner scanner = new Scanner(System.in);
        while (true){
            String linha = scanner.nextLine();
            String[] numeros = linha.split(" ");
            if (numeros[0].equals("0")) {
                break;
            }
            int area_casa = Integer.parseInt(numeros[0]) * Integer.parseInt(numeros[1]) * 100;
            double area_total = (double) (area_casa / Integer.parseInt(numeros[2]));
            Integer lado_terreno = (int) Math.sqrt(area_total);
            System.out.println(lado_terreno);
        }
        scanner.close();

    }

}
