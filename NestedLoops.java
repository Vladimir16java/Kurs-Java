public class NestedLoops {
    public static void main(String[] args) {
        int najmanjiBroj = 1;



        while (najmanjiBroj * najmanjiBroj * najmanjiBroj < 12000);{
            najmanjiBroj++;
        }

        System.out.println(najmanjiBroj);
    }
}
