package control;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto = "";

        do{
            System.out.println("Usted necesita hablar " +
                    "las palabras magicas....");
            System.out.println("Quiere salir? ");
            texto = input.nextLine();
        }
        while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Gracias!");
        input.close();
    }
}
