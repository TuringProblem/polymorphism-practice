
public class Person {
    private String name;
    private String birthdate;

    /**
     * @see Person -> default constructor
     */
    public Person() {
        name = "No name yet";
        birthdate = "No birthdate yet";
    }

    /**
     *
     * I like using 'this' keyword to refer to the instance variable
     * @param name -> grabs the instance variable name
     * @param birthdate -> grabs the instance variable birthdate
     */
    public Person(String name, String birthdate) {
        setName(name);
        setBirthdate(birthdate);
    }

    /**
     * getters and setters for birthdate,
     * @param newName -> initializes value of instance variable name
     *                getName() returns the set value
     */

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    /**
     * @param initBirthDate -> initilizes value of instance variable birthdate
     *                      getBirthdate() returns the set value
     */

    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }
    public String getBirthdate() { return birthdate; }
    public void writeOutput() {
        System.out.printf("Name: %s \nBirthdate: %s\n", name, birthdate);
    }

    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name) && this.birthdate.equalsIgnoreCase(otherPerson.birthdate);
    }
}
