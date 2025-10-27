
public class HelloWorld{

    public static void main(String[] args) {
		
		int num = 50;
		String name = "Jack";
		Float deci = 199.999909F;
		boolean isFun = true;
		char symbol ='$';
		
		// using println method		
        System.out.println("my first java code");
		System.out.println("learning java is fun");
		
		//Using print method
		System.out.print("The print  method  should  be used to accept input ");
		System.out.print("Another print method \n");
		
		
		// using printf METHOD 
		System.out.printf("I bought %d quantity of bread%n", num);
		System.out.printf("My name is %s %n",name);
		System.out.printf("Your balance is %c %.3f%n",symbol,deci);
    	System.out.printf("Is java fun? %b%n",isFun);
		System.out.printf("Do you enjoy learning \"Java\"");
	}    
}



