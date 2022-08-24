package Entreinando;

/**
 * @author : Hejociara
 * 22/08/22
 */
public class PrimitiveMain {

    public static void main(String[] args) {
        byte anosDeEmpresa = 10;
        short numberFlights = 320;
        int id = 358185;
        long pontosAcumulados =3_851_454_121L;

        float salary = 3_250.141F;
        double vendasAcumuladas = 3_546_155.08;

        boolean beVacation = true;

        char status = 'V';

        System.out.println(anosDeEmpresa * 365);
        System.out.println(numberFlights / 2);
        System.out.println((pontosAcumulados / vendasAcumuladas) + "\n" );
        System.out.println("ID:" + id +" ganha: " + salary);
        System.out.println("Vacation: " + beVacation);
        System.out.println("Status: " + status);

    }
}


