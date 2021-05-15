public class VariablesTask {
    public static void main(String[] args) {
        triangle(3,4,5);
        triangle(2,10,8);
        triangle(5,6,5);
        triangle(5,5,5);
    }
    static void triangle(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Lygiakrastis");
        } else if (a == b || a == c || b == c) {
            System.out.println("Lygiasonis");
        } else {
            System.out.println("Ivairiakrastis");
        }
    }
}
