package control;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(
                "Informa el número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0)
            System.out.println("Número par!!!");

         if (numero % 2 == 1)
             System.out.print("Número ímpar!");
    }
}
