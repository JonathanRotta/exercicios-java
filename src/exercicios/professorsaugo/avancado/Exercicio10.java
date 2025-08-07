package exercicios.professorsaugo.avancado;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra:");
        String palavra = sc.nextLine();

        char[] letras = palavra.toCharArray();

        for (char i: letras) {
            System.out.println(i);
        }

        sc.close();
    }
}
