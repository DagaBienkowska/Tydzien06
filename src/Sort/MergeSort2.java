package Sort;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] array1 = {234, 45, 234, 67, 456, 23, 157, 59, 34, 135, 178, 655};
        MergeSort(array1, 0, array1.length-1);
    }

    public static int[] Merge(int[] input, int left, int mid, int right) {
        int i;
        int j;
        int[] tab = new int[input.length];
        for (i = mid + 1; i > left; i--) {
            tab[i - 1] = input[i - 1];
        }
        for (j = mid; j < right; j++) {
            tab[right + mid - j] = input[j + 1];
        }
        for (int k = left; k <= right; k++) {
            if (tab[j] < tab[i]) {
                input[k] = tab[j];
                j--;
            } else {
                input[k] = tab[i];
                i++;
            }
        }
        return input;
    }

    public static int[] MergeSort(int[] input, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            MergeSort(input, left, mid);
            MergeSort(input, mid + 1, right);
            Merge(input, left, mid, right);
        }
        return input;
    }
}

