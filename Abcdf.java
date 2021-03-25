import java.util.Locale;
import java.util.Scanner;

public class Abcdf {
    public static void main(String[] args) {
        System.out.println("Unesite slovo");
        Scanner scanner =new Scanner(System.in);

        String unos = scanner.nextLine();
        unos=unos.toUpperCase();
        switch (unos){
            case "A":
                System.out.println("5");
                break;

            case "B":
                System.out.println("4");
                break;
            case "C":
                System.out.println("3");
                break;
            case "D":
                System.out.println("2");
                break;
            case "F":
                System.out.println("1");
                break;

        }






    }
}
