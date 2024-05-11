package Task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Test", 23);
        //person yaradir ve deyerleri ( name = Test ve yasi = 23 olur)
        System.out.println(test(person));
        // ilk olaraq yuxarida olan personun age ni deyisie (age = 25)olur
        // daha sonra yeniden bir person yaradir yeni referansini deyisir deyerleri (name = Test  ve yasi = 23) olur
        // daha ikinci yaratdigi person nameni deyisir edir (name = Test2) olur
        // retun Olaraq System out println ikinci personun deyeri 23 cixir Cunki artiq ikinci personun referansini tutur
        System.out.println(person);
        // bu ise basdan etibaren birinci personda olub cunki persona ikinci deyeri falan verilmir ona gore de
        // yuxarida olan person name ve ageni yeni Test ve 23 toString ile print edir.
    }

    private static int test(Person person) {
        person.setAge(25);
        person = new Person("Test", 23);
        person.setName("Test2");
        return person.age ;
    }

    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person name: " + this.name + ", age: " + this.age;
        }
    }
}
