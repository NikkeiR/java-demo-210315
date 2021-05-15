public class areaOfTriangle {
    public static void main(String[] args) {
        area(3,4,5);
        area(2,10,8);
        area(5,6,5);
        area(5,5,5);
    }

    static boolean isTriangleValid(int a,int b,int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    static void area(int a,int b,int c) {
        if (isTriangleValid(a,b,c)) {
            double p = 0.5 * (a+b+c);
            double triangleArea = Math.sqrt(p * (p - a)*(p - b)*(p - c));
            System.out.println("Plotas = " + triangleArea);
        }
    }
}
