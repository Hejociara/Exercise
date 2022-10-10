package Entrenando;

public class Ternary {
    public static void main(String[] args) {
        double promedio = 8.6;
        String resultadoFinal = promedio >= 7.0 ?
                "aprobado." : "desaprobado.";
        System.out.println("El alumno está " + resultadoFinal);

        double nota = 9.8;
        boolean buenComportamiento = true;
        boolean pasoPromedio = nota >= 7.0;
        boolean trabajo = buenComportamiento && pasoPromedio;
        String resultado = trabajo ? "Sí." : "No.";

        System.out.printf("Hacer trabajo? %s", resultado);
    }
}
