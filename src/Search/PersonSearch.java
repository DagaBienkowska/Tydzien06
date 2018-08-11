package Search;

import java.util.List;

public class PersonSearch {

    public Integer personSearch (Integer age, PersonSearchTest.Person[] input){
        return search(age, input, 0, input.length -1);
    }

    private Integer search (Integer age, PersonSearchTest.Person[] input, int low, int high){
        if (high < low){
            return -1;
        }
        int mid = (low + high) / 2;
        if (input[mid].getAge().compareTo(age) == 1){
            return search(age, input, 0, mid -1);
        } else if (input[mid].getAge().compareTo(age) == -1 ){
            return search(age, input, mid + 1, high);
        } else {
            return mid;
        }
    }
    public Integer searchLinear(Integer age, PersonSearchTest.Person[] input) {
        for (int i = 0; i < input.length; i++){
            if (input[i].getAge().equals(age)){
                return i;
            }
        }
        return -1;
    }
}


