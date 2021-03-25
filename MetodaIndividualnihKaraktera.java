public class MetodaIndividualnihKaraktera {
    public static void ispisiKaraktere(char pocetniKarakter, char zavrsniKarakter, int brojPoLiniji) {
        int brojac = 0;
        for (char i = pocetniKarakter; i <= zavrsniKarakter; i++) {
            System.out.print(i + " ");
            brojac++;
            if (brojac == brojPoLiniji) {
                System.out.println();
                brojac = 0;
            }

        }

    }


}
