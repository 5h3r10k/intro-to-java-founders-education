package code;
import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String job1;
		String job2;
		String timeOfDay;
		String organ;
		String bodyPart1;
		String bodyPart2;
		
		System.out.println("Name a job:");
		job1 = input.next();
		
		System.out.println("Name another job:");
		job2 = input.next();
		
		System.out.println("Name a time of the day (morning, afternoon, etc):");
		timeOfDay = input.next();
		
		System.out.println("Name an organ in the body:");
		organ = input.next();
		
		System.out.println("Name a part of the body:");
		bodyPart1 = input.next();
		
		System.out.println("Name another part of the body:");
		bodyPart2 = input.next();
		
		System.out.println("\n ---------------- \n  YOUR MAD LIBS: \n ---------------- \n");
		
		System.out.println("What ever happened to predictability? \n"
				+ "The "+job1+", the "+job2+", "+timeOfDay+" TV. \n"
				+ "Everywhere you look (everywhere you go) \n"
				+ "There's a "+organ+" (there's a "+organ+") \n"
				+ "A "+bodyPart1+" to hold onto. \n"
				+ "Everywhere you look (everywhere you go) \n"
				+ "There's a "+bodyPart2+" \n"
				+ "Of somebody who needs you. \n"
				+ "When you're lost out there and you're all alone, \n"
				+ "A light is waiting to carry you home, \n"
				+ "Everywhere you look.");
		
		input.close();
			

	}

}
