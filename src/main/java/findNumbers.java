public class findNumbers {
    public static void main(String[] args) {
        // intervalas nuo 1 iki 1000

        for (int i = 1; i < 1000; i++) {
            if (1000 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
