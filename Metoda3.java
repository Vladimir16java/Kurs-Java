public class Metoda3 {
    public static int sabiranje(int prviBroj, int drugiBroj) {
        int rezultat = 0;
        rezultat = prviBroj + drugiBroj;
        return rezultat;

    }
    public static double sabiranje1(double prviBroj, double drugiBroj){
        double rezultat1 = 0;
        rezultat1 = prviBroj + drugiBroj;
        return rezultat1;

    }

    public static void main(String[] args) {
        System.out.println(sabiranje(2, 4));
        System.out.println(sabiranje1(2.0,4.00));
    }
}



