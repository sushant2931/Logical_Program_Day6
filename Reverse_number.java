package Day6_LogicalProblems;

import java.util.Scanner;

public class Reverse_number {
	

	
		private static Scanner sc;

		public static void main(String[] args) {
			int num = 0;
			int reverseNum = 0;
			System.out.println("Enter your number: ");


			sc = null;
			num = sc.nextInt();
				
				while ( num != 0 )
				{
					reverseNum  = reverseNum * 10;
					reverseNum  = reverseNum  + num%10;
					num = num/10;
				}
				System.out.println("Reverse number is: " + reverseNum );
		}

}
