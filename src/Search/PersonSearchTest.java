package Search;

public class PersonSearchTest {
    public static class Person {
        private String name;
        private String surname;
        private Integer age;

        public Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person[] persons = new Person[8];
        persons[0] = new Person("Damian", "Kowalski", 15);
        persons[1] = new Person("Marek", "Lubicz", 16);
        persons[2] = new Person("Mirek", "Malinowski", 18);
        persons[3] = new Person("Ada", "Kubik", 19);
        persons[4] = new Person("Antek", "Janko", 22);
        persons[5] = new Person("Maria", "Anotos", 23);
        persons[6] = new Person("Miguel", "Bangla", 28);
        persons[7] = new Person("Anna", "Bicz", 30);

        PersonSearch personSearch = new PersonSearch();
        System.out.println(personSearch.personSearch(22, persons));

        Person[] persons2 = new Person[8];
        persons[0] = new Person("Damian", "Kowalski", 15);
        persons[1] = new Person("Marek", "Lubicz", 13);
        persons[2] = new Person("Mirek", "Malinowski", 18);
        persons[3] = new Person("Ada", "Kubik", 22);
        persons[4] = new Person("Antek", "Janko", 21);
        persons[5] = new Person("Maria", "Anotos", 31);
        persons[6] = new Person("Miguel", "Bangla", 28);
        persons[7] = new Person("Anna", "Bicz", 30);


        System.out.println(personSearch.searchLinear(13, persons2));
    }
}
