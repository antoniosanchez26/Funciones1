package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, suma;
        Scanner entrada = new Scanner(System.in);

        n1 = pideNumero(entrada, "Escribe número 1: ");
        n2 = pideNumero(entrada, "Escribe número 1: ");

        suma = sumaNumeros(n1, n2);

        System.out.print(n1 + " + " + n2 + " = " + suma);

        entrada.close();
    }

    private static int pideNumero(Scanner entrada, String texto) {
        int numero;
        System.out.print(texto);
        numero = entrada.nextInt();
        return numero;
    }

    private static int sumaNumeros(int numero1, int numero2) {
        int suma;
        suma = numero1 + numero2;
        return suma;
    }
}