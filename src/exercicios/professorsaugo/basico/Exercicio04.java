package exercicios.professorsaugo.basico;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno:");
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        int numeroTres = sc.nextInt();

        double calculoMedia = (numeroUm + numeroDois + numeroTres) / 3;
        if(calculoMedia < 7){
            System.out.println("O aluno está reprovado");
        }else{
            System.out.println("O aluno foi aprovado!");
        }
        System.out.println("A média dos números informados é: " + calculoMedia);

        sc.close();
    }
}
