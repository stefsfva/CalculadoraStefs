package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double a = scanner.nextDouble();
        String operador = scanner.next();
        Double b = scanner.nextDouble();

        scanner.close();

        //Criando instancia para a classe Operacoes.
        Operacoes operacoes = new Operacoes();

        double resultado;

        switch (operador) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                resultado = a / b;
            default:
                resultado  = 0;
                break;
        }

        System.out.println(resultado);





    }
}