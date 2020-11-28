import java.util.Scanner;

public class HelloFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int localInt=45;
		System.out.println("This is an initialized local Value "+localInt);
		Scanner inputTest = new Scanner(System.in);
		System.out.println("Enter your age -Read as String");
		String age = inputTest.nextLine();
		System.out.println("Your age is "+age);
		System.out.println("Converting String age into int");
		int intAge=Integer.parseInt(age);
		System.out.print("Next year you'll be "+(intAge+1));
	}
}
