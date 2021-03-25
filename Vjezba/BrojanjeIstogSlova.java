package Vjezba;

public class BrojanjeIstogSlova {
    public static int count(String str, char a) {
        int brojac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                brojac++;
            }
        }
        return brojac;
    }
}
