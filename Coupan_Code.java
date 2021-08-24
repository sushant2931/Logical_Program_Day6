package Day6_LogicalProblems;

public class Coupan_Code {
	
		public static void main(String[] args) {
			
			char [] chars = "abcdefghijllmnop". toCharArray();    // char array to get characters for coupen
			 
			int max = 10000;                                     //  length of coupen
			
			Double d = Math.random();
			int random = (int) (d*max);
			String sb = " ";
			System.out.println("Random Double :" + d +   "Random at start " + random);
			
			
			while (random>0)
			{
				sb = sb +(chars[random % chars.length]);
				random /= chars.length;
				System.out.println(random + "  " + random % chars.length +  " sb is " +  sb);
			}
			
			String couponCode = sb.toString();
			System.out.println("Coupon Code: " + couponCode);
		}

}
