import java.util.Scanner;

public class Sub_Array_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int iterator = 0; iterator < size; iterator++) {
            array[iterator] = scanner.nextInt();
        }

        System.out.println(subarray_sum(array, size));
    }

    static int subarray_sum(int[] array, int size) {
        int row_sum=0;
        int final_sum=0;

        for(int i=0; i<size; i++) {
            row_sum = 0;
            for(int j=i; j<size; j++) {
                row_sum += array[j];
                final_sum += row_sum;
            }
        }
        return final_sum;
    }
}
