package control;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una nota: ");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0)
            System.out.println("Nota inválida");
        else
            System.out.println("Nota válida");

        entrada.close();
    }
}
