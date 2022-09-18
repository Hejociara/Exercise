package control;

import java.util.Scanner;

/**
 * @author: Hejociara
 */

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe la media: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0){
            System.out.println("Ha sido aprobado!!!");
            System.out.println("Bien hecho!!!");
        }
        if (media < 7.0 && media >= 4.5){
            System.out.print("Recuperación");
        }
        boolean criterioReprobar =
                media <4.5 && media >= 0;
        if (criterioReprobar){
            System.out.print("Estás reprobado");
        }
        entrada.close();
    }
}
