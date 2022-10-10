package Entrenando;

public class Asignacion {
    public static void main(String[] args) {

        var a = 3;
        var b = a;
        var c = a+b;

        c += b;
        c -= a;
        c *= b;
        c /= a;

        System.out.println(c);
        c %= 2;
        System.out.println(c);
    }
}
