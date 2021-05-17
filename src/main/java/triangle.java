import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        int[] initialData;
        if (args.length == 3) {
            initialData = data();
        } else {
            initialData = dataFromArgs(args);
        }

        int a = initialData[0];
        int b = initialData[1];
        int c = initialData[2];
        String typeOfTriangle = solution(a,b,c);

        result(typeOfTriangle);
    }

    static int[] dataFromArgs(String[] args) {

        int[] x = new int[3];

        x[0] = Integer.parseInt(args[0]);
        x[1] = Integer.parseInt(args[1]);
        x[2] = Integer.parseInt(args[2]);

        return x;
    }

    static int[] data() {
        System.out.println("Data for triangle: ");

        Scanner scanner = new Scanner(System.in);
        int[] x = new int[3];

        x[0] = scanner.nextInt();
        x[1] = scanner.nextInt();
        x[2] = scanner.nextInt();

        return x;
    }

    static String solution(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Lygiakrastis";
            } else if (a == b || b == c || c == a) {
                return "Lygiasonis";
            } else {
                return "Ivairiakrastis";
            }
        }
        return "Negali buti trikampis";
    }

    static void result(String x) {
        System.out.println(x);
    }
}
