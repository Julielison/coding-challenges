package BEE1759;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)){
            int numero = scanner.nextInt();
            for (int i = 0; i < numero; i++){
                if (i == numero - 1 ){
                    System.out.print("Ho!");
                    continue;
                }
                System.out.print("Ho ");
            }
            System.out.println();
        }
    }
}
