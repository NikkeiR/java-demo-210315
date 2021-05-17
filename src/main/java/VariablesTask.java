public class VariablesTask {
    public static void main(String[] args) {
        triangle(3,4,5);
        triangle(2,10,8);
        triangle(5,6,5);
        triangle(5,5,5);
    }

    static void triangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Lygiakrastis");
            } else if (a == b || b == c || a == c) {
                System.out.println("Lygiasonis");
        } else if (a != b && b != c) {
                System.out.println("Ivairiakrastis");
            }
        } else {
            System.out.println("Ne trikampis");
        }
    }
}
