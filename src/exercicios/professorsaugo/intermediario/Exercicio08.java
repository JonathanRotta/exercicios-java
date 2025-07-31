package exercicios.professorsaugo.intermediario;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois numeros para realizar a operação");
        System.out.print("Primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Selecione uma operação:");
        System.out.println("1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão");
        String operacao = scanner.nextLine();

        double resultado = 0;
        switch (operacao){

            case "1":
                resultado = numero1 + numero2;
                break;
            case "2":
                resultado = numero1 - numero2;
                break;
            case "3":
                resultado = numero1 * numero2;
                break;
            case "4":
                if (numero2 == 0){
                    System.out.println("Erro: não é possível dividir por zero");
                }else {
                    resultado = numero1 / numero2;
                    break;
                }
        }
        System.out.println("O resultado da operação é " + resultado);
        scanner.close();

    }
}
