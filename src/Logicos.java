public class Logicos {
    /**
     * @author Hejociara
     */
    public static void main(String[] args) {
        boolean condicion1 = true;
        boolean condicion2 = 3 > 7;

        System.out.println(condicion1 && !condicion2);
        System.out.println(condicion1 || condicion2);
        System.out.println(!!condicion1);
        System.out.println(!condicion2);

        System.out.println("Mesa de la verdad & (AND)");
        System.out.println(true && true);
        System.out.println(true && false);


        System.out.println("Mesa de la verdad OU (OR");
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Mesa de la verdad OU Exclusivo (XOR) ");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Mesa de la verdad NOT");
        System.out.println(!true);
        System.out.println(!false);

    }
}
