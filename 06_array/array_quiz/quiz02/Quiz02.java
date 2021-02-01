package array_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. index, 값 세팅
		int[] numbers = {3, 5, 2, 10, 39};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("변경할 index와 변경할 값을 입력하세요:");
		int index = scan.nextInt();
		int value = scan.nextInt();
		numbers[index] = value;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		// 2. 점수 채점
		char[] scores = { 'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X' };
		int score = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				score += 100 / scores.length;
			}
		}
		System.out.println(score + "점");

		// 3.
		//	평일 시급 : 8500원
		//	주말(토,일) 시급 : 9500원
		//	일주일간 총 임금은 254500원

		int[] works = { 3, 5, 5, 3, 5, 3, 5 };
		int wage = 0;
		for (int i = 0; i < works.length; i++) {
			if (i >= 5) { // 주말
				wage += works[i] * 9500;
			} else {  // 평일
				wage += works[i] * 8500;
			}
		}
		System.out.println("일주일간 총 임금은 " + wage + "원");
	
		// 4. 짝수 배열
		int[] evens = new int[5];
		int idx = 0;
		while (idx < 5) {  // 0 1 2 3 4
			System.out.print("수를 입력하세요:");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				evens[idx] = number;
				idx++;
			}
		}
		
		for (int i = 0; i < evens.length; i++) {
			System.out.print(evens[i] + " ");
		}
	}
}
