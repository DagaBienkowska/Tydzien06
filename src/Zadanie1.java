import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> namesWithJob = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj imię");
            String name = scanner.nextLine();
            System.out.println("Podaj dział");
            String job = scanner.nextLine();

            List<String> names = new ArrayList<>();
            if (namesWithJob.containsKey(job)){
                List<String> namesList = new ArrayList<>();
                List<String> temp = namesWithJob.get(job);
                for (String s : temp){
                    namesList.add(s);
                }
                namesList.add(name);
                namesWithJob.put(job, namesList);
            } else {
                names.add(name);
                namesWithJob.put(job, names);
            }


        }
        System.out.println(namesWithJob);
    }

}
