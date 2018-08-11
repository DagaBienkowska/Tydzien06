import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> namesWithJob = new HashMap<>();
        boolean boo = true;

        while (true) {

            System.out.println("Podaj imię i dział");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("list")) {
                System.out.println(namesWithJob);
                boo = false;
                break;
            }
            String[] worker = input.split(" ");
            List<String> names = new ArrayList<>();
            if (!namesWithJob.containsKey(worker[1])) {
                names.add(worker[0]);
                namesWithJob.put(worker[1], names);
            } else {
                List<String> namesList = new ArrayList<>();
                List<String> temp = namesWithJob.get(worker[1]);
                for (String s : temp) {
                    namesList.add(s);
                }
                namesList.add(worker[0]);
                namesWithJob.put(worker[1], namesList);
            }


        }


    }

}
