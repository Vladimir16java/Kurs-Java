/*Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.*/



package Vjezba;

public class Password {
    public static void potvrdi(String sifra) {
        final int MIN_BROJ_KARAKTERA = 9;
        final int MIN_BROJEVA = 2;
        boolean validnaSifra = true;
        int brojac = 0;
        if (sifra.length() < MIN_BROJ_KARAKTERA) {
            System.out.println("Pogresna sifra, nedovoljan broj karaktea");
            validnaSifra = false;
        }
        for (int i = 0; i < sifra.length(); i++) {
            char karakter = sifra.charAt(i);
            if (!Character.isLetterOrDigit(karakter)) {
                System.out.println("Pogresna sifra; sadrzi specificne karaktere");
            }

        }

    }

}
