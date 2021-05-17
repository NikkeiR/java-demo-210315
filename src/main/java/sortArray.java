import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] array = {-10,0,2,9,-5};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        int number;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    number = array[i];
                    array[i] = array[j];
                    array[j] = number;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
