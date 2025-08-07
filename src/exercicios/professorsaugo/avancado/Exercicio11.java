package exercicios.professorsaugo.avancado;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma palavra");

        String palavra = sc.nextLine();

        char[] letras = palavra.toCharArray();
        int vogal = 0;
        int consoante = 0;

        for (int i = 0; i < letras.length; i++) {

            if(letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u'){
                vogal++;

            }else {
                consoante++;
            }

        }
        System.out.println("A quantidade de vogal é: " +vogal);
        System.out.println("A quantidade de consoante é: " +consoante);

        sc.close();
    }
}
