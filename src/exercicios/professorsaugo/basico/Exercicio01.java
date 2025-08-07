package exercicios.professorsaugo.basico;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9/5 + 32;

        System.out.println(" A temperatura em Fahrenheit é:" + fahrenheit);

        scanner.close();
    }
}
