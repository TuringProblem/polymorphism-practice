/**
 * @author: Override
 * @since 02/29/2024 @ 19:54
 * @see <a href="https://Github.com/TuringProblem">GitHub Profile</a>
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
		Person[] people = new Person[5];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		people[4] = new Person("Bugg, June", 9901);

		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}