package BEE1564;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String reclamacoes = sc.nextLine();
                if (reclamacoes.equals("0")) {
                    System.out.println("vai ter copa!");
                    continue;
                }
                System.out.println("vai ter duas!");
            }
        }
    }
}