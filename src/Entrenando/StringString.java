package Entrenando;

public class StringString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0));
        String s = "Buenas tardes";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Buenas"));
        System.out.println(s.toLowerCase().startsWith("buenas"));
        System.out.println(s.toUpperCase().endsWith("TARDES"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("buenas tardes"));
        System.out.println(s.equalsIgnoreCase("buenas tardes"));

        var nombre = "Juscelino";
        var apellido = "Kubitschek";
        var edad = 50;
        var sueldo = 12_150.32;

        System.out.printf("El señor %s %s tiene %d años y recibe R$%.2f",
                nombre, apellido, edad, sueldo);





    }
}
