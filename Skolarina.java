public class Skolarina {
    public static void main(String[] args) {
        double skolarina = 10000;
        final double POSKUPLJENJE = 0;
        double cjenaPoslednjeCetiriGodine = 0;


        for (int godina = 1; godina <= 14; godina++) {
            skolarina *= POSKUPLJENJE;
            if (godina == 10) {
                System.out.println("Skolarina u 10toj godini" + skolarina);
            }
            if (godina > 10) {
                cjenaPoslednjeCetiriGodine += skolarina;
            }
            System.out.println("Skolarina za posljednje 4 god" + cjenaPoslednjeCetiriGodine);
        }

    }
}