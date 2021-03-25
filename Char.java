import java.util.Scanner;

public class Char {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rijeci");

        String poruka = scanner.nextLine();

        System.out.println("Duzina je: " + poruka.length());
        System.out.println("Prvo slovo je: " + poruka.charAt(0));

    }
}