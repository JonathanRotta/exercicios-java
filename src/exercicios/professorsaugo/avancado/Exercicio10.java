package exercicios.professorsaugo.avancado;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra:");
        String palavra = sc.nextLine();

        char[] letras = palavra.toCharArray();

        char[] letrasInvertidas = new char[letras.length];

        for (int i = 0; i < letras.length; i++) {
            letrasInvertidas[i] = letras[letras.length - 1 - i];

        }

        if (Arrays.equals(letras,letrasInvertidas)){
            System.out.println("É palíndromo");
        }else{
            System.out.println("Não é palíndromo");
        }

        sc.close();
    }
}
