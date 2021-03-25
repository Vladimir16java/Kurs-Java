package Vjezba;

public class BrojanjeSlova {
    public static int counterLetters(String s){
        int brojac=0;
        for (int i=0; i<s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                brojac++;
            }
        }
        return brojac;
    }
}
