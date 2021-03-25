/*Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.*/


package Vjezba;

public class ProstiBroj {



    public static boolean isPrime(int broj) {
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {
                return false;
            }
        }
        return true;
    }

}