package BEE1789;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNext()){
                String n = scanner.nextLine();
                String linha = scanner.nextLine();
                String[] velocidades = linha.split(" ");
                List<String> velocidadesList = Arrays.asList(velocidades);
                List<Integer> velocidadesInt = velocidadesList.stream()
                        .map(Integer::parseInt)
                        .toList();
                int maior = Collections.max(velocidadesInt);
                String nivel = "1";
                if (maior >= 20){
                    nivel = "3";
                } else if (maior >= 10){
                    nivel = "2";
                }
                System.out.println(nivel);
            }
        }
    }
}
