package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Assistant", 27045.78));
        people.add(new Employee("George", "Harrison", "Professor", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.35));
        people.add(new Student("Paul", "McCartney", 3.89));
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> list) {
        for (Person person : list) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                System.out.println(employee.toString() + " earns " + employee.getPaymentAmount() + " tenge");
            } else if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println(student.toString() + " earns " + student.getPaymentAmount() + " tenge");
            }
        }
    }
}
