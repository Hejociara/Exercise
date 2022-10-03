public class Relacional {
    public static void main(String[] args) {
        System.out.println(3 > 4);
        System.out.println(3 <= 7);
        System.out.println(30 != 7);

        double nota = 7.3;
        boolean buenComportamiento = true;
        boolean pasoPromedio = nota >= 7;

        boolean descuento = buenComportamiento && pasoPromedio;

        System.out.println("Hay descuento? " + descuento);
    }
}
