public class Ternary {
    public static void main(String[] args) {
        double media = 8.6;
        String resultadoFinal = media >= 7.0 ?
                "aprobado." : "desaprobado.";
        System.out.println("El alumno está " + resultadoFinal);

        double nota = 9.8;
        boolean buenComportamiento = true;
        boolean pasoPorMedia = nota >= 7.0;
        boolean trabajo = buenComportamiento && pasoPorMedia;
        String resultado = trabajo ? "Sí." : "No.";

        System.out.printf("Hacer trabajo? %s", resultado);
    }
}
