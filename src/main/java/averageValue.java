public class averageValue {
    public static void main(String[] args) {
        int[] a = {5,6,10,15,8,4};
        int[] b = {8,5,3};

        int sum1 = 0;
        for (int num : a) {
            sum1 += num;
        }

        double sum2 = 0;
        for (int num : b) {
            sum2 += num;
        }
        System.out.println((sum1 / a.length) - (sum2 / b.length));
    }
}
