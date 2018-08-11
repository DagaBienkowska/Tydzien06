package Search;

public class Test {
    public static void main(String[] args) {
        Integer[] ints = {3,6,43,12,95,23,17,4,30};
        LinearSearch test1 = new LinearSearch();
        System.out.println(test1.search(17, ints));
        System.out.println(test1.search(0, ints));
        System.out.println(middleElement(ints));
        System.out.println();
        toIndex(ints, 6);
        System.out.println();
        fromIndex(ints, 4);


    }

    public static Integer middleElement (Integer[] array){
        if (array.length % 2 == 0){
            return array[array.length/2 - 1];
        }
        return array[array.length/2];
    }

    public static void toIndex (Integer[] array, int index){
        if (index < array.length) {
            for (int i = 0; i < index; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Błędny index");
        }
    }

    public static void fromIndex (Integer[] array, int index){
        if (index < array.length) {
            for (int i = index; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Błędny index");
        }
    }
}
