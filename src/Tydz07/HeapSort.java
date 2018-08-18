package Tydz07;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        Integer[] array = {8, 7, 6, 6, 4, 6, 5, 1, 4, 3, 6, 2, 4};
        int index = 5;

        System.out.println("Lewe dziecko rodzica o indedksie " + index + " ma indeks " +
        leftChildIndex(array, index));
        System.out.println("Prawe dziecko rodzica o indeksie " + index + " ma indeks " +
        rightChildIndex(array, index));
        System.out.println("Ojciec dziecka o indeksie 8: " + parentIndex(array, 8));
        System.out.println("Czy istnieje lewe dziecko rodzica o indeksie 3? " +doesLeftChildExist(array, 3));
        System.out.println("Czy istnieje prawe dziecko rodzica o indeksie 6? " +doesRightChildExist(array, 6));
        System.out.println("Czy węzeł o indeksie 11 jest liściem? " + isLeaf(array, 11));
        compareChildToParent(array, 3);
        Integer[] array2 = {34,12,56,89,21,34,65};
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(BuildHeap(array2)));
        System.out.println(Arrays.toString(ShiftHeap(BuildHeap(array2))));

    }
    public static int leftChildIndex(Integer[] input, int index){
        int leftChild = (index * 2) + 1;
        return leftChild;
    }
    public static int rightChildIndex(Integer[] input, int index){
        int rightChild = (index * 2) + 2;
        return rightChild;
    }
    public static int parentIndex (Integer[] input, int index){
        int parent = 0;
        if (index != 0){
            parent = (index - 1) / 2;
        } else {
            return -1;
        }
        return parent;
    }
    public static boolean doesLeftChildExist(Integer[] input, int index){
        boolean boo = false;
        if (2 * index + 1 < input.length){
            boo = true;
        } else {
            return boo;
        }
        return boo;
    }
    public static boolean doesRightChildExist(Integer[] input, int index){
        boolean boo = false;
        if (2 * index + 2 < input.length){
            boo = true;
        } else {
            return boo;
        }
        return boo;
    }
    public static boolean isLeaf(Integer[] input, int index){
        boolean boo = false;
        if (2 * index + 2 > input.length){
            boo = true;
        } else {
            return boo;
        }
        return boo;
    }
    public static void compareChildToParent (Integer[] input, int index){
        int parentIndex = parentIndex(input, index);
        if (input[index] > input[parentIndex]){
            System.out.println("Indeks: " + index + " | wartość dziecka: " + input[index]);
            System.out.println("Indeks: " + parentIndex + " | wartość rodzica: " + input[parentIndex]);
            System.out.println("Wartość dziecka większa niż rodzica");
        } else {
            System.out.println("Indeks: " + index + " | wartość dziecka: " + input[index]);
            System.out.println("Indeks: " + parentIndex + " | wartość rodzica: " + input[parentIndex]);
            System.out.println("Wartość dziecka mniejsza niż rodzica");
        }
    }

    public static Integer[] BuildHeap(Integer[] input){
        for (int i = 1; i < input.length; i++){
            int j = i;
            int k = parentIndex(input, j);
            int x = input[i];
            while (k >=0 && input[k] < x){
                input[j] = input[k];
                j = k;
                k = parentIndex(input, j);
            }
            input[j] = x;
        }
        return input;
    }
    public static Integer[] ShiftHeap(Integer[] input){
        int temp = 0;
        for (int i = input.length - 1; i >= 1; i--){
            temp = input[0];
            input[0] = input[i];
            input[i] = temp;
            int j = 0;
            int k = 1;
            while ( k < i){
                int m = k;
                if (k + 1 < i && input[k + 1] > input[k]){
                    m = k + 1;
                }
                if (input[m] <= input[j]){
                    break;
                }
                temp = input[j];
                input[j] = input[m];
                input[m] = temp;
                j = m;
                k = j + j + 1;
            }
        }
        return input;
    }
}
