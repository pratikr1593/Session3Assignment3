import java.util.Scanner;

public class Assgnment3Session3 {

	public static void main(String[] args) {
		System.out.println("Enter a  no ");
		Scanner scan = new Scanner(System.in);
		int no= scan.nextInt();
		Assgnment3Session3 randomNoObject = new Assgnment3Session3();

		System.out.println(randomNoObject.generateRandomNo(no));
		
	
	}
	
	public int generateRandomNo(int n)
	{
		return (int) (Math.random()*n);
		
	}
}