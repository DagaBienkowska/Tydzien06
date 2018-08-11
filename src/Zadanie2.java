import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zadanie2 {
    public static class Employee{
        String name;
        String lastname;
        String position;
        long id;

        public Employee(String name, String lastname, String position, long id) {
            this.name = name;
            this.lastname = lastname;
            this.position = position;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(FileSystems.getDefault().getPath("emplo.txt"))) {
            List<Employee> employeesList = stream.map(line->line.split(" "))
                    .map(tablica -> {
                        System.out.println(Arrays.toString(tablica));
                        return new Employee(tablica[0], tablica[1], tablica[2], Long.parseLong(tablica[3]));})
                    .sorted(new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return (int) o1.id - (int) o2.id;
                        }
                    })
                    .collect(Collectors.toList());
            PrintWriter writer = new PrintWriter("sorted.txt", "UTF-8");
            for (Employee e : employeesList){
               writer.println(e.name + " " + e.lastname + " " + e.position + " "+ e.id);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
