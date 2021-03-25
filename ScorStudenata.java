/*(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.*/


import java.util.Scanner;

public class ScorStudenata {
    public static void main(String[] args) {
        System.out.println("Unesite br studenata");
        Scanner scanner = new Scanner(System.in);
        int brStudenata = scanner.nextInt();
        String prviStudent = "";
        String drugiStudent = "";
        int brBodovaPrvi = 0;
        int brBodovaDrugi = 0;

        for (int i = 0; i < brStudenata; i++) {
            System.out.println("Unesite ime studenta");
            String uneseniStudent = scanner.next();
            System.out.println("Unesite br bodova");
            int brojUnesenihBodova = scanner.nextInt();
            if (brojUnesenihBodova > brBodovaPrvi) {
                drugiStudent = prviStudent;
                prviStudent = uneseniStudent;

                brBodovaDrugi = brBodovaPrvi;
                brBodovaPrvi = brojUnesenihBodova;
            }
            else if (brojUnesenihBodova > brBodovaDrugi) {
                brBodovaDrugi = brojUnesenihBodova;
                drugiStudent = uneseniStudent;
            }
            System.out.println("brojUnesenihBodova = " + brojUnesenihBodova);
            System.out.println("brBodovaPrvi = " + brBodovaPrvi);
            System.out.println("drugiStudent = " + drugiStudent);
            System.out.println("brBodovaDrugi = " + brBodovaDrugi);
        }
    }
}
