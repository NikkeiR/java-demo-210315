public class VariablesTask {
    public static void main(String[] args) {
        triangle(3,4,5);
        triangle(2,10,8);
        triangle(5,6,5);
        triangle(5,5,5);
    }

    static boolean isTriangleValid(int a,int b,int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    static void triangle(int a,int b,int c) {
        if (isTriangleValid(a,b,c) && a == b && b == c) {
            System.out.println("Lygiakrastis");
        } else if (isTriangleValid(a,b,c) && a == b || a == c || b == c) {
            System.out.println("Lygiasonis");
        } else if (isTriangleValid(a,b,c) && a != b && b != c) {
            System.out.println("Ivairiakrastis");
        } else {
            System.out.println("Netinkamos reiksmes");
        }
    }
}
