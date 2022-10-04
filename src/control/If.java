package control;

import java.util.Scanner;

/**
 * @author: Hejociara
 */

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe el promedio: ");
        double promedio = entrada.nextDouble();

        if (promedio <= 10 && promedio >= 7.0){
            System.out.println("Ha sido aprobado!!!");
            System.out.println("Bien hecho!!!");
        }
        if (promedio < 7.0 && promedio >= 4.5){
            System.out.print("Recuperación");
        }
        boolean criterioReprobar =
                promedio <4.5 && promedio >= 0;
        if (criterioReprobar){
            System.out.print("Estás reprobado");
        }
        entrada.close();
    }
}
