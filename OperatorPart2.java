public class OperatorPart2{
	public static void main (String [] args ){
		int num1=30;
		int num2 = 35;
		int num3 = 17;
		 // And logical operator
			boolean result = (num1 > num2 ) && (num1 > num3);
			System.out.printf("The result is %b%n", result);
			
			//OR logical  operator
			boolean result2 = (num1> num2)|| (num1>num3 );
			System.out.printf("The result is %b%n", result2);
			
			
			// Not logical operator
			boolean result3 =! ((num1 > num2) && (num1 > num3));
			System.out.printf(" The result is  %b%n", result3);

			// pre - increment unary operator
			int num4 =10;
			System.out.printf(" %d%n",num4);
			System.out.printf("%d%n" ,++num4);
			
			// post- increment unary operator
			int num5 = 10;
			System.out.printf("%d%n",num5);
			System.out.printf(" %d%n",num5++);
			System.out.printf("%d%n",num5);
	



			// pre - increment unary operator
		
			System.out.printf(" %d%n",num4);
			System.out.printf("%d%n" ,--num4);
			
			// post- increment unary operator
			int  = 10;
			System.out.printf("%d%n",num5);
			System.out.printf(" %d%n",num5--);
			System.out.printf("%d%n",num5);
	}
}