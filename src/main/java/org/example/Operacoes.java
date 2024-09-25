package org.example;


public class Operacoes {

    // Método que soma dois números.
    public double soma(double a, double b) {
        return a + b;
    }

    // Método que subtrai dois números.
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método que multiplica dois números.
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método que divide dois números.
    public double dividir(double a, double b) {
        // Verificar se o divisor é zero para evitar erro
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return a / b;
    }
}
