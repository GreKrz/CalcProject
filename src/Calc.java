import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		double fNum, sNum, answer;
		System.out.println("Enter first num: ");
		fNum = bucky.nextDouble();
		System.out.println("Enter second num: ");
		sNum = bucky.nextDouble();
		answer = fNum + sNum;
		System.out.println(answer);
		
	}

}
