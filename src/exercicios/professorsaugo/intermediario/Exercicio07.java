package exercicios.professorsaugo.intermediario;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para verificar se é primo ou não: ");
        int numero = scanner.nextInt();

        boolean primo = true;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0){
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " Não é um número primo.");
        }


        scanner.close();
    }

}
