import java.util.Scanner;

public class IntroLoops {

	public static void main(String[] args) {

		Scanner kboard = new Scanner(System.in);
		Methods methods = new Methods();
		int menuChoice = 1;
		
		do{
			System.out.println("");
			System.out.println("---MENU---");
			System.out.println("What would you like to see?");
			System.out.println("1) division");
			System.out.println("2) printSeries");
			System.out.println("3) repeatWord");
			System.out.println("4) printIndexLine");
			System.out.println("5) divideSum");
			System.out.println("6) quit");
			System.out.print("-----> ");
			
			menuChoice = kboard.nextInt();
			
			switch(menuChoice) {
			case 1:
				System.out.println("Input a dividend: ");
				int dividend = kboard.nextInt();
				System.out.println("Input a divisor: ");
				int divisor  = kboard.nextInt();
				methods.divide(dividend, divisor);
				break;
			//Continue all cases
				
			}	
		}while(menuChoice != 6);
		
		kboard.close();
	}
}
		
