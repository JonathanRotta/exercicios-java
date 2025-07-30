package exercicios.professorsaugo.intermediario;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe um número:");
        int numero = sc.nextInt();

        int soma = 0;
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                soma += i;
            }

        }
        System.out.println("O resultado da soma é: "+soma);
    }
}
