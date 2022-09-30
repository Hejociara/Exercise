package Entrenando;

import static javax.swing.JOptionPane.showInputDialog;

public class ConversionStringNumbers {
    public static void main(String[] args) {
        String valor1 = showInputDialog(
                "Ingresa el primero numero: ");
        String valor2 = showInputDialog(
                "Ingresa el segundo número: ");

        System.out.println(valor1 + valor2);
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double suma = numero1 + numero2;
        System.out.println("Suma es " + suma);
        System.out.println("La media es " + suma /2);
    }
}
