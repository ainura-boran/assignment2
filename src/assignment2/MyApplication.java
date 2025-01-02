package assignment2;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Payable> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.5));
        printData(people);
    }

    public static void printData(ArrayList<Payable> list) {
        for (Payable p : list) {
            if (p instanceof Employee) {
                Employee employee = (Employee) p;
                System.out.println(employee.toString() + " earns " + employee.getPaymentAmount() + " tenge");
            } else if (p instanceof Student) {
                Student student = (Student) p;
                System.out.println(student.toString() + " earns " + student.getPaymentAmount() + " tenge");
            }
        }
    }
}
