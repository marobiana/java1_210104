package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 수를 입력 받아서 그 수만큼 "화이팅!!!" 를 출력하세요
		Scanner scan = new Scanner(System.in);
//		System.out.print("횟수를 입력하세요:"); // 4
//		int count = scan.nextInt();
//		int i = 0;  // 0 1 2 3 => 4
//		while (i < count) {   // 4
//			System.out.println("화이팅!!!");
//			i++;
//		}
		
		// 2. 수를 입력 받고 그 수에서 부터 0까지 한 줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.
//		System.out.print("카운트다운 수를 입력하세요:");
//		int countDown = scan.nextInt();   // 3 2 1 0 
//		while (countDown >= 0) {   // 3     0
//			System.out.println(countDown);
//			countDown--;
//		}
//		System.out.println("발사");
		
		// 3. 5번 동안 반복
//		수를 입력하세요:  : 4
//		출력 : 4
		
//		int i = 0;
//		while (i < 5) { // 0 1 2 3 4
//			System.out.print("수를 입력하세요:");
//			int number = scan.nextInt();
//			System.out.println("출력:" + number);
//			i++;
//		}
		
		// 4. 구구단
		// 3 X 1 = 3
		// 3 X 2 = 6
		int number = 3;  // 단수
		int i = 1;
		while (i <= 9) {
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
	}
}
