/*(Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid.*/

import java.util.Scanner;

public class SSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String socijalniBroj = "232-23-5435"; // 4 i 7 karakteri
        for (int i = 0; i < socijalniBroj.length(); i++) {

            if (socijalniBroj.charAt(i) != '-')
                System.out.println("Invalidan unos");
            break;

        }


    }
}
