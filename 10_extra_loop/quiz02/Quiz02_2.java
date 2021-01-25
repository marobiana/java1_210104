package quiz02;

import java.util.Scanner;

public class Quiz02_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 연도를 입력하세요:");
		int year1 = scan.nextInt();
		int year2 = scan.nextInt();
		int leapYearCount = 0;
		
		for (int i = year1; i <= year2; i++) {
			if ((i % 400 == 0) || (i % 100 != 0 && i % 4 == 0)) {
				leapYearCount++;
			}
		}
		
		System.out.println(leapYearCount);
	}

}
