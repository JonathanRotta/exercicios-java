package exercicios.professorsaugo.basico;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número que irei dizer se ele é par ou ímpar:");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");

        }
        sc.close();
    }
}
