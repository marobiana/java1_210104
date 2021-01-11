package variable_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.print("hello world \n");
		System.out.println("hello world");
		
		// ctrl + 1 또는 ctrl + shift + o
		Scanner scan = new Scanner(System.in); // 가상의 통로가 열렸다.
		System.out.print("숫자를 입력하세요:");
		int number = scan.nextInt(); // 숫자를 입력 받는다.
		System.out.println(number);
		
		// 육개장 가격 입력
		System.out.print("육개장 가격을 입력하세요:");
		int noodleCup = scan.nextInt();
		System.out.println("육개장 가격은 " + noodleCup + "원");
		
		System.out.print("육개장 개수를 입력하세요:");
		int count = scan.nextInt();
		int noodleCups = noodleCup * count;
		System.out.println("육개장 " + count + "개의 가격은 " + noodleCups + "원");
		
		scan.close();
	}
}
