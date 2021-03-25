/*Napisati program koji simulira bacanje kovanice milion puta te ispusuje korisniku koliko puta je novcic pao na glavu
a koliko na pismo */

public class BacanjeNovcica {
    public static void main(String[] args) {
        int brojacGlave = 0;
        int brojacPisma = 0;


        for (int i = 0; i < 1000000; i++) {
            int simulator = (int) (Math.random() * 1000000) + 1;
            if (simulator < 500000) {

                brojacGlave++;
            } else {

                brojacPisma++;
            }
        }
        System.out.println("Novcic je na glavu pao:" + brojacGlave);
        System.out.println("Novcic je na pismo pao:" + brojacPisma);


    }
}
