//Calculator 
//Alex James
//CSE 002
//9-18-2015

import java.util.Scanner; // calls Scanner Class
public class CalculatorSpecial{
	public static void main(String[] args) { //main method
	Scanner keyboard = new Scanner(System.in);
	System.out.println("If you want to Stop, type n or N to stop");
	String n = keyboard.next().toUpperCase(); //Stops code
	while(!n.equals("N")){ //runs Calculator
	    System.out.println("Please print integer 1");
	    int a = keyboard.nextInt();
	    //User inputs integer 2
	    System.out.println("Print integer 2");
	    int b = keyboard.nextInt();
	    int answer; // answer variable
	    //User inputs operator
	    System.out.println("Please enter operator: *,/,-,+");
	    String operator = keyboard.next();
	    switch (operator){
	        //Multiplies a and b (a*b)
		    case "*": answer = a * b;
			    System.out.println("a*b = " + answer);
			break;
		    //Uses division between a and b (a/b)
		    case "/": answer = a / b;
			    System.out.println("a/b = " + answer);
			break;
	        //Uses Subtraction between a and b (a-b)
		    case "-": answer = a * b;
			    System.out.println("a-b = " + answer);
			break;
	        //Adds a and b (a+b)
		    case "+": answer = a + b;
			    System.out.println("a+b = " + answer);
			break;
	    //Informs that an operator was not inputed
		    default: System.out.println("Invalid operator");
			break;}
	    System.out.println("If you want to Stop, type n or N to stop");
	    n = keyboard.next().toUpperCase(); //Stops code
	    }
	}
    
}