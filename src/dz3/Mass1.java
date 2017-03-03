package dz3;

import java.util.Arrays;

public class Mass1 {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr2 = Arrays.copyOf(arr1, 10);

        System.out.println(Arrays.toString(arr1));//ввывод общего
        System.out.println();

        for (int i = 5; i < arr2.length; i++)
            System.out.println(arr2[i]);//ввывод скопированного

        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        System.out.println();
        System.out.println(sum);// ввывод суммы
    }
}
