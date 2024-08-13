package ex01;

import java.util.Scanner;

//이름 나이 입력

public class InputNameAge 
{
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		  Scanner sc = new Scanner(System.in); Printer printer = new Printer();
		  System.out.println("이름을 입력하세요: "); String name = sc.nextLine();
		  
		  System.out.println("나이를 입력하게요 :"); int age = sc.nextInt();
		  
		  printer.Print("이름 : " + name + " 나이 : " + age);
		 

	}


}
