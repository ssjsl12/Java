package ex02;

import ex01.Printer;

public class NumberChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer print = new Printer();
		
		int num1 = 20;
		int num2 = 30;
		int tmp = 0;
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
	    print.Print(num1 + " " + num2);
	    
	}
	
	
}
