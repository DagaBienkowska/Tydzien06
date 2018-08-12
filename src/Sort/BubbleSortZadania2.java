package Sort;

import java.util.Arrays;

public class BubbleSortZadania2 {
    public static void main(String[] args) {
        int[] ints = {23, 11, 87, 93, 47};
        sortArray(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void sortArray(int[] input){
        int temp = 0;
        for (int i = 0; i < input.length -1; i++){
            for (int j = 0; j < input.length -1; j++){
                if (input[j] > input[j + 1]){
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }
}
