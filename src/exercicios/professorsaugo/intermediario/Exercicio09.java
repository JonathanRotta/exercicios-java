package exercicios.professorsaugo.intermediario;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 numeros: ");
        int[] lista = new int[5];
        lista[0] = scanner.nextInt();
        lista[1] = scanner.nextInt();
        lista[2] = scanner.nextInt();
        lista[3] = scanner.nextInt();
        lista[4] = scanner.nextInt();

        int maior = lista[0];
        int menor = lista[0];

        for (int i = 0; i < 5; i++) {
            if (lista[i] > maior){
                maior = lista[i];
            }
            if (lista[i] < menor){
                menor = lista[i];
            }
            
        }
        System.out.println("O menor número é " +maior+ " e o menor número é " +menor);
    }
}
