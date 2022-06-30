package Basic_Calculator;
import java.util.*;
public class Calculator1 {

	public static void main(String[] args) {
		double number1,number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number");
		 number1 = sc.nextDouble();
		 number2 = sc.nextDouble();
		 System.out.println("Chose your oprator:(+,-,*,/)");
		 char op= sc.next().charAt(0);
		 double Results=0;
		 switch(op) {
		 //case add two number
		 case '+':
			 Results=number1+number2;
		 break;
		 //case Subtraction two number
		 case '-':
			 Results=number1-number2;
		 break;
		 // case multiply two number
		 case '*':
			 Results=number1*number2;
		 break;
		 //case Division two number
		 case '/':
			 Results= number1/number2;
		 break;
		 default:
			 System.out.println("Wrong number");
		 break;
		 
		 
		 }
		 
		 System.out.println("Yor result is: ");
		 System.out.println();
		 System.out.println(number1+" "+ op +" "+number2 + "="  +Results);

	}

}
