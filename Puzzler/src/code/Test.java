package code;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "E";
		switch (grade) {
		  case "A":
		  case "B":
		    System.out.println("Fantastic grade");
		    break;
		  case "C":
		    System.out.println("Average grade");
		    break;
		  case "D":
		  case "F":
		    System.out.println("Poor grade");
		    break;
		  default:
		    System.out.println("Invalid grade");
		    break;
		}
		
		String [][] teacher = {{"Mr.","Mrs."},{"Johnson","Davis"}};
		System.out.println(teacher[0][1] + " " + teacher[1][0]);
	}

}
