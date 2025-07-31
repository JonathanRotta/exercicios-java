package exercicios.professorsaugo.intermediario;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para que seja calculado seu fatorial: ");
        int number = scanner.nextInt();


        while (number < 1){
            System.out.println("Número inválido. Tente novamente. ");
            System.out.println("Insira um número para que seja calculado seu fatorial: ");
            number = scanner.nextInt();
        }
        long fatorial = 1;
        for (int i = 1; i <= number; i++) {
            fatorial *= i;

        }

        System.out.println("O fatorial de "+ number + " é: " + fatorial);
        scanner.close();
    }
}
