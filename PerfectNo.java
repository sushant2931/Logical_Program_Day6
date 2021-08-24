package Day6_LogicalProblems;

import java.util.Scanner;

public class PerfectNo {
	

	
		  public static void main(String[] args) 
		    {
		        int n, sum = 0;
		        try (Scanner sc = new Scanner(System.in)) {
					System.out.print("Enter any integer you want to check:");
					n = sc.nextInt();
				}
		        for(int i = 1; i < n; i++)
		        {
		            if(n % i == 0)
		            {
		                sum = sum + i;
		            }
		        }
		        if(sum == n)
		        {
		            System.out.println(n + " " + " -:Given number is Perfect");
		        }
		        else
		        {
		            System.out.println(n + " " +  "-:Given number is not Perfect");
		        }    
	}
	}
