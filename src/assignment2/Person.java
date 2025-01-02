package assignment2;

public class Person implements Payable {
    private static int nextId = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = nextId++;
        this.name = "";
        this.surname = "";
    }

    public Person(String name, String surname) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
    public String getPosition() {
        return "Person";
    }
    public double getPaymentAmount() {
        return 0.0;
    }
}
