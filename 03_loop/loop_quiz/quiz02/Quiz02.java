package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 반복 출력
		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		// 2. 반복 출력
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3. 특정 조건 구하기
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 4. 개수 세기
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
			}
		}
		System.out.println("7의 배수 개수는 " + count);
		
		// 5. 구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요:");
		int number = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " X " + i + " = " + number * i);
		}
	}

}
