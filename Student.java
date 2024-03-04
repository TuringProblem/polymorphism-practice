import java.util.Scanner;

public class Student extends Person {
    private int studentNumber;
    /**
     * @Constructor -> default constructor with super class(person) also default
     * @Constructor -> initial name from parent class -> initial student number
     * @Constructor -> initial name, and birthdate from parent class -> init student number.
     */
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
    /**
     * Method resets the initial name, birthdate, student number
     */
    public void reset(String newName, int newBirthdate, int newStudentNumber) {
        setName(newName);
        setBirthdate(newBirthdate);
        studentNumber = newStudentNumber;
    }
    /**
     * Setters/Getters for student number -> getStudentNumber() -> returns the number. setStudentNumber() -> sets the init value for student number
     */
    public int getStudentNumber() { return studentNumber; }
    public void setStudentNumber(int newStudentNumber) { studentNumber = newStudentNumber;}
    /**
     * @return the output of the Student and the Student Number
     */
    @Override
    public void writeOutput() {  super.writeOutput(); System.out.printf("Student Number: %d\n", getStudentNumber()); }
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
