
public class Student extends Person {
    private int studentNumber;

    public Student() {
        super();
        studentNumber = 0;//Indicating no number yet
    }

    public Student(String initialName, int initialStudentNumber) {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public Student(String initialName, int initialStudentNumber, int initialBirthdate) {
        super(initialName, initialBirthdate);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newBirthdate, int newStudentNumber) {
        setName(newName);
        setBirthdate(newBirthdate);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() { return studentNumber; }

    public void setStudentNumber(int newStudentNumber) { studentNumber = newStudentNumber;}

    /**
     * @return the output of the Student and the Student Number
     */
    @Override
    public void writeOutput() {  super.writeOutput(); System.out.printf("Name: %s\nStudent Number: %d\n", getName(), getStudentNumber()); }


    /**
     * @param otherStudent
     * @return boolean logic -> if the name is the same name as other students -> return true, else return false.
     */
    public boolean equals(Student otherStudent) {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }
    /**
     * Although we have a method that writes the output, it is still nice to send toString() :) incase you would like to use it
     */
    public String toString() {
        return "Name: " + getName() +
                "\nStudent number: " + studentNumber;
    }

 /* //For Optional Section
    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (!(otherObject instanceof Student))
            return false;
        else
        {
            Student otherStudent = (Student)otherObject;
            return (this.sameName(otherStudent)
                && (this.studentNumber ==
                                otherStudent.studentNumber));
        }
    }
*/

}
