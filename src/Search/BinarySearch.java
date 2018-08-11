package Search;

import java.util.List;

public class BinarySearch implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        return bsearch(value, input, 0, input.length-1);
    }

    public Integer bsearch (Integer v, Integer[] input, int low, int high){
        if (high < low){
            return -1;
        }
        int mid = (low + high) / 2;
        if (input[mid] > v){
            return bsearch(v, input, 0, mid -1);
        } else if (input[mid] < v) {
            return bsearch(v, input, mid + 1, high);
        } else {
            return mid;
        }
    }
}
