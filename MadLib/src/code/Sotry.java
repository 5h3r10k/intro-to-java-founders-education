package code;
import java.util.Scanner;

public class Sotry {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your favorite number?");
		Double favNum;
		favNum = input.nextDouble();
		
		System.out.println("Who is a person you know?");
		String person;
		person = input.next();
		
		System.out.println("Name a verb.");
		String verb;
		verb = input.next();
		
		input.close();
		
		System.out.println("There's "+favNum+" of summer vacation,");
		System.out.println("'Til "+person+" comes along just to end it,");
		System.out.println("So the annual problem for our generation,");
		System.out.println("Is finding a "+verb+" way to spend it");

	}

}
