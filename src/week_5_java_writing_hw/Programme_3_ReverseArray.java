package week_5_java_writing_hw;

import java.util.Arrays;

/**
 * write a java programme to reverse an array of integer values
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 34, 54, 67, 78}; // Single dimension array
        System.out.println("Original array: " + Arrays.toString(array));
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        System.out.println("Reverse array : ");
        obj.reverseArray(array);
    }

    //method for reverse an array
    public void reverseArray(int[] list) {
        for (int i = 0; i < (list.length) / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
