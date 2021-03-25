package APozivi;

import Vjezba.ProstiBroj;

import java.util.Scanner;

public class ProstiBrojTest {
    public static void main(String[] args) {
        System.out.println();
        Scanner unos =new Scanner(System.in);

;
        if(ProstiBroj.isPrime(unos.nextInt())){
            System.out.println("Broj je PRIME");
        }
        else {
            System.out.println("Broj is'not PRIME");
        }
    }
}
