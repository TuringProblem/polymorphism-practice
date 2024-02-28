
public class Undergraduate extends Student
{
    private int level; //1 for freshman, 2 for sophomore,
    private String major;                    //3 for junior, or 4 for senior.
    public Undergraduate( ) {
        super( );
        level = 1;
    }
    public Undergraduate(String initialName, int initialStudentNumber, 
                         int initialLevel)
    {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
    }
    public Undergraduate(String initialName, int initialStudentNumber,
                         int initialLevel, String myMajor)
    {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
        setMajor(myMajor);
    }
    
    public void reset(String newName, int newStudentNumber, int newBirthdate,
	                  int newLevel, String myMajor)
    {
        reset(newName, newStudentNumber, newBirthdate); //Student�s reset
        setLevel(newLevel); //Checks 1 <= newLevel <= 4
        setMajor(myMajor);
    }

    public String getMajor( ) { return major; }
    public void setMajor(String myMajor) { major = myMajor; }
    public int getLevel( )
    {
        return level;
    }
    
    public void setLevel(int newLevel)
    {
        if ((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else
        {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
    
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.printf("Student Level: %d\nStudent Major: %s\n",getLevel(), getMajor());
    }
 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return equals((Student)otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
/*  // Alternate version 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return super.equals(otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
*/	
}
