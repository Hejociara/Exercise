public class Logicos {
    /**
     * @author Hejociara
     */
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println(condition1 && !condition2);
        System.out.println(condition1 || condition2);
        System.out.println(!!condition1);
        System.out.println(!condition2);

        System.out.println("Mesa de la verdad & ");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Mesa de la verdad OU");

    }
}
