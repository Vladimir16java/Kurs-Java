
import java.util.Scanner;

public class VelikaMalaSlova {
    public static void main(String[] args) {

        int brojacVelikihSlova = 0;
        int brojacMalihSlova = 0;
        Scanner scanner = new Scanner(System.in);
        String unosOdKorsinika = scanner.nextLine();


        for (int i = 0; i < unosOdKorsinika.length(); i++) {
            if (Character.isUpperCase(unosOdKorsinika.charAt(i))) {
                brojacVelikihSlova++;
            } else if (Character.isLowerCase(unosOdKorsinika.charAt(i))) {
                brojacMalihSlova++;

            }
        }
        System.out.println("Valikih slova" + brojacVelikihSlova);
        System.out.println("Malih slova" + brojacMalihSlova);
    }
}