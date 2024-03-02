import java.util.ArrayList;

public class UndergraduateDemo {
    public static void main(String[] args) {
        ArrayList<Undergraduate> undergraduates = new ArrayList<>();
        for (Undergraduate num : undergraduates) {
            undergraduates.add(num);
        }

        Undergraduate ug1 = new Undergraduate("James Bond", 007, 1);
        ug1.writeOutput();
        System.out.println();
        ug1.reset("Sam Spade", 1940, 2);
        System.out.println("ug1 is:");
        ug1.writeOutput();

        Undergraduate ug2 = new Undergraduate("James Bond", 007, 1);
        System.out.println("\nug2 is:");
        ug2.writeOutput();
        if (ug1.equals(ug2))
            System.out.println("Same students.\n");
        else
            System.out.println("Not the same students.\n");

        //hasSameName inherited from Student, which inherited it from Person.
        if (ug1.hasSameName(ug2))
            System.out.println("Same names.");
        else
            System.out.println("Not the same names.");

        Undergraduate ug3 = new Undergraduate("James Bond", 007, 1);
        System.out.println("\nug3 is:");
        ug3.writeOutput();
        if (ug3.equals(ug2))
            System.out.println("Same students.\n");
        else
            System.out.println("Not the same students.\n");
        Undergraduate ug4 = new Undergraduate("James Bond", 0077, 1, "Computer Science");
        System.out.println("ug4 is:");
        ug4.writeOutput();
        if (ug4.equals(ug3))
            System.out.println("\nSame students.\n");
        else
            System.out.println("\nNot the same students.\n");
        if (ug4.hasSameName(ug3) && ug4.hasSameName(ug2))
            System.out.println("Same names");
        else
            System.out.println("Not the same names");
    }
}