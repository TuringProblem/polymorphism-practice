/**
 * @author: Override
 * @since 02/29/2024 @ 19:51
 * @see <a href="https://Github.com/TuringProblem">GitHubProfile</a>
 */
public class Person {
    private String name;
    private int birthdate;
    /**
     * @Constructor -> person() -> default
     * @Constructor -> person(String name) -> overloading Person
     * @Constructor -> person(String name, int birthdate) -> overloading Person
     */
    public Person() { name = "No name yet"; }
    public Person(String name) { this.name = name; }
    public Person(String name, int birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    /**
     * @param newName -> returns the name of the person... getName() -> Retrieves that data passed.
     */
    public void setName(String newName) { name = newName; }

    public String getName() { return name; }

    /**
     * @param yourBirthDate -> returns the birthdate of the person... getBirthdate() -> Retrieves that data passed.
     */
    public void setBirthdate(int yourBirthDate) { birthdate = yourBirthDate; }
    public int getBirthdate() { return birthdate; }

    /**
     * @returns the value of the birthdate, if it is 0, then it will return "N/A", else it will return the birthdate.
     */
    public String myLogic() { return switch (birthdate){ case 0 -> "N/A"; default -> String.valueOf(getBirthdate());};}

    /**
     * Add if statement to check if the birthdate is 0, then print N/A.
     */
    public void writeOutput() {System.out.printf("Name: %s\nBirthdate: %s\n", getName(), myLogic()); }

    /**
     * @param otherPerson
     * @return -> boolean logic to check if the name is the same as the other person's name.
     */
    public boolean hasSameName(Person otherPerson) { return this.name.equalsIgnoreCase(otherPerson.name); }
    /**
     * Again, although we have a method that writes the output, it is still nice to send toString()--in the case, we would like to print just the string values in the class.
     */
    @Override
    public String toString() { return "Name: " + name + "\nBirthdate: " + myLogic();}
}
