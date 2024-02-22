
public class Undergraduate extends Student
{
    private int level; //1 for freshman, 2 for sophomore,
    private String major;                   //3 for junior, or 4 for senior.
    public Undergraduate( )
    {
        super( );
        level = 1;
        major = "No major selected";
    }
    
    public Undergraduate(String initialName, int initialStudentNumber, int initialLevel, string initialMajor)
    {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
        setMajor(initialMajor);
    }
    
    public void reset(String newName, int newStudentNumber, 
	                  int newLevel)
    {
        reset(newName, newStudentNumber); //Student�s reset
        setLevel(newLevel); //Checks 1 <= newLevel <= 4
    }
    
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
    public String getMajor( ){ return major; }
    public void setMajor(String major) { this.major = major;}
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.printf("Student Level: %d \nStudent Major: %s", level, major);
    }
 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return equals((Student)otherUndergraduate) &&
               (this.level == otherUndergraduate.level || this.major.equals(otherUndergraduate.major);
    }
/*  // Alternate version 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return super.equals(otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
*/	
}
