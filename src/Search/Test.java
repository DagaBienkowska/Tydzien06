package Search;

public class Test {
    public static void main(String[] args) {
        Integer[] ints = {3,6,43,12,95,23,17,4,30};
        LinearSearch test1 = new LinearSearch();
        System.out.println(test1.search(17, ints));
        System.out.println(test1.search(0, ints));
    }
}
