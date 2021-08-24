package Functional_Programs;

import java.util.Scanner;

public class StopWatch {



	
		//static variables for storing start and end time
		static double start = 0, stop = 0;             
		
		
		//Method create  to put start time and print it:
		static void startTime() 
		{
			start = System.currentTimeMillis();
			System.out.println("started at " + start);
		}
		//Method to put stop time and print it:
		static void stopTime() {
			stop = System.currentTimeMillis();
			System.out.println("stopped at " + stop);
		}
		static void elapsedTime() 
		{
			System.out.println("elapsed time is " + (stop - start) / 1000);
		}
		public static void main(String[] args) {
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("enter 1 to start");
				s.next();
				startTime();
				System.out.println("enter to stop");
				s.next();
			}
			stopTime();
			elapsedTime();
		}
}
