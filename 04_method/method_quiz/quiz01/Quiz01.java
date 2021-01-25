package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 
//		System.out.print("제곱할 숫자를 입력하세요:");
//		int number = scan.nextInt();
//		int squared = getSquared(number);
//		System.out.println(number + "의 제곱은 " + squared + "이다.");
		
		// 2. 
//		System.out.print("평균을 구할 점수 4개를 입력하세요:");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		double average = getAverage(score1, score2, score3, score4);
//		System.out.println("평균은 " + average);
		
		// 3. 
//		System.out.print("숫자와 나눌 수를 입력하세요:");
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		printQuotientRemainder(number1, number2);
		
		// 4. 
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		System.out.println(isEvenNumber(number));
	}
	
	public static int getSquared(int x) {
		return x * x;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (score1 + score2 + score3 + score4) / (double)4;
	}

	public static void printQuotientRemainder(int number1, int number2) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("몫:" + quotient);
		System.out.println("나머지:" + remainder);
	}
	
	public static boolean isEvenNumber(int number) {
//		if (number % 2 == 0) {
//			return true;
//		} 
//		return false;
//		
		return number % 2 == 0 ? true : false;
	}
}
