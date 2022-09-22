package control;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una nota: ");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0) {
            System.out.println("Nota inválida");
            System.out.println("Felicitación");
        }
        else if (nota >= 8.1)
            System.out.println("Concepto A");
        else if (nota >= 6.1)
            System.out.println("Concepto B");
        else if(nota >= 4.1)
            System.out.println("Concepto C");
        else if(nota >= 2.1)
            System.out.println("Concepto D");
        else if(nota >= 2.1)
            System.out.println("Concepto E");

        System.out.println("Fin");

        entrada.close();
    }
}
