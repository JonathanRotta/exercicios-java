package exercicios.professorsaugo.basico;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso(kg):");
        double peso = sc.nextDouble();

        System.out.println("Informe sua altura(m):");
        double altura = sc.nextDouble();

        double calculoImc = peso / (altura * altura);

        if(calculoImc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (calculoImc > 18.5 && calculoImc <= 24.9) {
            System.out.println("Peso normal");
        } else if (calculoImc >= 25.0 && calculoImc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (calculoImc >= 30.0 && calculoImc <= 34.9) {
            System.out.println("Obesidade grau 1");
        }else if (calculoImc >= 35.0 && calculoImc <= 39.9) {
            System.out.println("Obesidade grau 2");
        }else{
            System.out.println("Obesidade grau 3");
        }

        sc.close();
    }
}
