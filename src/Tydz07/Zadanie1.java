package Tydz07;

import java.util.*;
import java.util.stream.Collectors;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(312,412,213,322,565,312,234,412,343,465,565));
        System.out.println(list);
        List<Integer> listSorted = sortedWithoutDuplicates(list);
        System.out.println(listSorted);

        List<Integer> list2 = list.stream()
                .distinct() //usuwa duplikaty
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list2);
    }

    private static List<Integer> sortedWithoutDuplicates(List<Integer> input){
        Set<Integer> set = new HashSet<>();
        set.addAll(input);
        List<Integer> listSorted = new ArrayList<>();
        listSorted.addAll(set);
        listSorted.sort((o1, o2) -> o1 - o2);
        return listSorted;
    }

}
