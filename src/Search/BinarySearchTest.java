package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
       Integer[] binaryInts = {1,2,3,4,6,7,9};
       BinarySearch btest = new BinarySearch();
       int value = 2;
        System.out.println("Szukana wartość " + value +" znajduje się na indeksie: " +
                btest.search(value, binaryInts));

        System.out.println("Szukana wartość " + value +" znajduje się na indeksie: " +
                binarySearchIter(binaryInts, 2));

    }
    public static Integer binarySearchIter (Integer[] input, Integer value){
        int low = 0;
        int high = input.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (input[mid] > value){
                high = mid - 1;
            } else if (input[mid] < value){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
