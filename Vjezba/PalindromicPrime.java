package Vjezba;

public class PalindromicPrime {

    private static boolean palindrom(int number) {
        int palindrom = 0;
        int OrginalniBroj = number;


        while (number != 0) {
            palindrom *= 10;
            int posljednaCifra = number % 10;
            palindrom += posljednaCifra;
            number /= 10;
        }
        return palindrom == OrginalniBroj;
    }
}




