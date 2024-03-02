/**
 * @author: Override
 * @since 02/29/2024 @ 19:51
 * @see <a href="https://Github.com/TuringProblem">GitHubProfile</a>
 */
public class Undergraduate extends Student {
    /**
     * Level, and major of the students -> level == 1, 2, 3, 4 (freshman, sophomore, junior, senior)
     */
    private int level;
    private String major;

    /**
     * @Constructor -> Undergraduate() -> default
     * @Constructor -> Undergraduate(String initialName, int initialStudentNumber, int initialLevel) -> overloading Undergraduate with super class init name
     * @Constructor -> Undergraduate(String initialName, int initialStudentNumber, int initialLevel, String myMajor) -> overloading Undergraduate with super class init name and init major
     */
    public Undergraduate( ) {
        super( );
        level = 1;
    }
    public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
    }
    public Undergraduate(String initialName, int initialStudentNumber, int initialLevel, String myMajor) {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
        setMajor(myMajor);
    }
    public void reset(String newName, int newStudentNumber, int newBirthdate, int newLevel, String myMajor) {
        reset(newName, newStudentNumber, newBirthdate); //Student�s reset
        setLevel(newLevel); //Checks 1 <= newLevel <= 4
        setMajor(myMajor);
    }
    /**
     * @return the major of the student, and sets the major of the student
     */
    public String getMajor( ) { return major; }
    public void setMajor(String myMajor) { major = myMajor; }
    /**
     * @return the level of the students, and sets the level of the students -> if the newLevel() is not less than 1, and greater than 4 -> we are good Else we are doomed.
     */
    public int getLevel( ) { return level; }
    public void setLevel(int newLevel) {
        if ((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
    /**
     * using new Switch expression with Java jdk 21
     * @see <a href="https://openjdk.java.net/jeps/361">JEP 361: Switch Expressions</a>
     * @return the result of the int level
     * used a Try -> catch block, just incase this method throws an exception -> it will still run through the code, and print out a stack trace.
     */
    public  String levelToDegree() {
        getLevel();
        try {
            return switch (level) {
                case 1 -> "Freshman";
                case 2 -> "Sophomore";
                case 3 -> "Junior";
                case 4 -> "Senior";
                default -> "You are NOT a student!";
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "You are NOT a student!";
    }
    /**
     * Outputs the super class (Student name and number) -> and prints level and the major of the student
     * if the major is null, it will print "undeclared" -> along with the levels being String now instead of Integer.
     */
    @Override
    public void writeOutput( ) {
        super.writeOutput( );
        System.out.printf("Level: %s\n", levelToDegree());
        if (major == null) {
            System.out.println("Major: undeclared\n");
        } else {
            System.out.printf("Major: %s\n", getMajor());
        }
    }
    /**
     * @param otherUndergraduate
     * checks if the parent class has the same name as the subclass, and if the level is the same as the subclass.
     */
    public boolean equals(Undergraduate otherUndergraduate) {
        return equals((Student)otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
/*  // Alternate version 
    public boolean equals(Undergraduate otherUndergraduate) {
        return super.equals(otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
*/	
}
