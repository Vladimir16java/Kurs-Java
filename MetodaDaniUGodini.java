import java.util.Scanner;

public class MetodaDaniUGodini {
    public static void main(String[] args) {
        System.out.println(daniuGodini(2000));
    }

    public static int daniuGodini(int Godina) {
        if (Godina % 4 == 0 && Godina % 100 != 0 || Godina % 400 == 0) {
        return 366;
        }
        else {
            return 365;
        }

    }
}
