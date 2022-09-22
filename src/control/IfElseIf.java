package control;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una nota: ");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0)
            System.out.println("Nota inválida");
        else if (nota >= 8.1) {
            System.out.println("Concepto A");
            }
        else if (nota >= 6.1)
            System.out.println("Concepto B");
        else if(nota >= 4.0){
            System.out.println("Concepto C");
        }

        System.out.println("Fin");

        entrada.close();
    }
}
