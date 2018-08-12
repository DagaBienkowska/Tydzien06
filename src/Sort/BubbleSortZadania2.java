package Sort;

import java.util.Arrays;
//do poprawy
public class BubbleSortZadania2 {
    public static void main(String[] args) {
        int[] ints = {23, 11, 87, 93, 47};
        int[] ints2 = {23, 11, 87, 93, 47};

        System.out.println(Arrays.toString(ints));

        int[] sorted = sortArray(ints);

        System.out.println(Arrays.toString(ints2));
        System.out.println();
        withoutLast(ints);
        sortedWithoutLast(ints2);
    }

    public static int[] sortArray(int[] input){
        int[] sortedArray = input;
        int temp = 0;
        for (int i = 0; i < sortedArray.length -1; i++){
            for (int j = 0; j < sortedArray.length -1; j++){
                if (sortedArray[j] > sortedArray[j + 1]){
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void withoutLast (int[] input){
        for (int i = 0; i < input.length; i++){
            for (int j = input.length - 1 - i; j > 0; j--){
                System.out.print(input[j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortedWithoutLast (int[] input){
        for (int i = input.length-1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (input[j] > input[j+1]){
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(input));
    }

}
