
public class Person {
    private String name;
    private int birthdate;

    public Person() { name = "No name yet"; }
    public Person(String name) { this.name = name; }

    public Person(String name, int birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public void setName(String newName) { name = newName; }

    public String getName() { return name; }
    public void setBirthdate(int yourBirthDate) { birthdate = yourBirthDate; }

    public void writeOutput() { System.out.printf("Name: %s\n Birthdate: %d" + name, birthdate);}

    public boolean hasSameName(Person otherPerson) { return this.name.equalsIgnoreCase(otherPerson.name); }
}
