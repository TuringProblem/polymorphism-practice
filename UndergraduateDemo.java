import java.util.ArrayList;
import java.util.Scanner;

public class UndergraduateDemo {

	static Scanner KEYBOARD = new Scanner(System.in);
    public static void main(String[] args) {



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


        System.out.println("Are you a student?");
        String response = KEYBOARD.nextLine().toLowerCase();

        if (response.equalsIgnoreCase("yes")) {
            Student stud = new Student();
            System.out.println("Are you an undergraduate?");
            {
                response = KEYBOARD.nextLine().toLowerCase();
                if (response.equalsIgnoreCase("yes")) {
                    Undergraduate undergrad = new Undergraduate();
                    System.out.println("What is your name?");
                    undergrad.setName(KEYBOARD.nextLine());
                    System.out.println("What is your birthdate?");
                    undergrad.setBirthdate(KEYBOARD.nextInt());
                    KEYBOARD.nextLine();
                    System.out.println("what is your student number?");
                    undergrad.setStudentNumber(KEYBOARD.nextInt());
                    KEYBOARD.nextLine();
                    System.out.println("What year are you currently on?\nie: 1 == freshman | 4 == Senior: ");
                    undergrad.setMajor(KEYBOARD.nextLine());
                    System.out.println("What is your major? ");
                    undergrad.setMajor(KEYBOARD.nextLine());
                    undergrad.writeOutput();
                } else {
                    System.out.println("You must not attend this University.");
                    System.out.println("do you have a name?");
                    stud.setName(KEYBOARD.nextLine());
                    System.out.println("What is your birthdate: ");
                    stud.setBirthdate(KEYBOARD.nextInt());
                    KEYBOARD.nextLine();
                    System.out.println("how about a student ID? Type an integer: ");
                    stud.setStudentNumber(KEYBOARD.nextInt());
                    stud.writeOutput();
                }
            }
        } else {
            System.out.println("You are not a student...");
        }

    }
}