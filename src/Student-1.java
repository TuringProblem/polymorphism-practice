
public class Student extends Person
{
    private int studentNumber;
    private int graduationYear;


    /**
     * Default constructor, added all default values (including super class)
     * -> super() grabs default values from Person class
     */
    public Student( )
    {
        super( );
        studentNumber = 0;
        graduationYear = 0;
    }

    public Student(String name, String birthdate, int studentNumber, int graduationYear)
    {
        super(name, birthdate);
        setStudentNumber(studentNumber);
        setGraduationYear(graduationYear);
    }

    public void reset(String newName, String newBirthdate, int newStudentNumber, int newGraduationYear)
    {
        super(name, birthdate);
        graduationYear = newGraduationYear;
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber( )
    {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }
    public int getGradtionYear(){
        return graduationYear;
    }
    public int setGraduationYear(int initGraduationYear) { graduationYear = initGraduationYear; }

    public void writeOutput( )
    {
        System.out.println("Name: " + getName( ));
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(Student otherStudent)
    {
        return this.hasSameName(otherStudent) &&
              (this.studentNumber == otherStudent.studentNumber);
    }


    public String toString( )
    {
        return "Name: " + getName( ) +
                "\nBirthdate: " + getBirthdate( ) +
			   "\nStudent number: "  + studentNumber +
                "\nGraduation year: " + graduationYear;
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
