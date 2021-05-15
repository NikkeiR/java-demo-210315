import java.util.Arrays;

public class PirmasFailas {
    public static void main(String[] args) {
        System.out.println("Yes");

        var x = "Labas rytas";
        System.out.println(x);

        char c = ' ';
        String s = "";

        System.out.println("Karalius: " + '\u265A' + " ir " + (char)9819);

        double d = 6/4;
        System.out.println(d);

        int d2 = 6/4;
        System.out.println(d2);

        double e = 1.0*6/4;
        System.out.println(e);

        double spindulys = 100;
        String atsakymas = "Apskritimo su spinduliu " + spindulys + " plotas yra " + 100*100*3.14159;
        System.out.println(atsakymas);

        String[] vardai = {"Ona", "Jonas"};
        vardai[1] = "Antanas";
        System.out.println(Arrays.toString(vardai));

        String[] adresai = new String[5];
        System.out.println(Arrays.toString(adresai));

        adresai[2] = "Vytauto g. 101, Jonava";
        System.out.println(Arrays.toString(adresai));
    }
}