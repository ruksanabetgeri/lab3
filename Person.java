

public class Person {
    String name, dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayPersonDetails() {
        int age = Period.between(LocalDate.parse(dob), LocalDate.now()).getYears();
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



