package control;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("salir")){
            System.out.println("Usted dice: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
