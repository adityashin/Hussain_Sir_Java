// package dynamic_init_arrays;

import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {
        // dynamic init of array : class loading([]), array object created in heap,array
        // inited
        int[] ints = { 10, 20, 30, 40, 50 };
        for (int i : ints) {
            System.out.println(i);
        }

        int[] ints2 = new int[]{1,2,3,4,5};
        // for( int i:ints2){
            // System.out.println(i);
            System.out.println("Array Contents"+Arrays.toString(ints2));
        // }
    }
}