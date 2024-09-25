package org.example;
import org.example.Operacoes;


import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criando instancias...
        Scanner scanner = new Scanner(System.in);

        Double a = scanner.nextDouble();
        String operador = scanner.next();
        Double b = scanner.nextDouble();

        scanner.close();
        Operacoes operacoes = new Operacoes();

        double resultado;

        switch (operador) {
            case "+":
                resultado = operacoes.soma(a,b);
                break;
            case "-":
                resultado = operacoes.subtrair(a,b);
                break;
            case "*":
                resultado = operacoes.multiplicar(a,b);
                break;
            case "/":
                resultado = operacoes.dividir(a,b);
            default:
                resultado  = 0;
                break;
        }

        System.out.println(resultado);





    }
}