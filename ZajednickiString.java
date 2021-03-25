/*(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings. Here are some
sample runs:*/


public class ZajednickiString {
    public static void main(String[] args) {
        String firstString = "Weltcome to C++";
        String secondString = "Welhcome to programming";
        String commonPrefix = "";
        int duzinaManjegSringa = Math.min(firstString.length(), secondString.length());

        for (int i = 0; i < duzinaManjegSringa; i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                commonPrefix += firstString.charAt(i);
            } else break;
        }
        System.out.println(commonPrefix);
    }
}
