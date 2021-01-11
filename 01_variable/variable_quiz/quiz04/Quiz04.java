package variable_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 두 수를 나눈 몫, 나머지
		Scanner scan = new Scanner(System.in);
//		System.out.print("입력1:");
//		int num1 = scan.nextInt();
//		System.out.print("입력2:");
//		int num2 = scan.nextInt();
//		
//		int quotient = num1 / num2;
//		int remainder = num1 % num2;
//		System.out.println("몫:" + quotient + ", 나머지:" + remainder);
		
		// 2. 교체(swap) 알고리즘
//		System.out.print("x:");
//		int x = scan.nextInt(); // 6
//		System.out.print("y:");
//		int y = scan.nextInt(); // 4
//		
//		// swap
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("x는 " + x + "이고, y는 " + y + "입니다.");
		
		// 3. 초를 입력 받아서 ?분?초 형태로 출력 하세요.
//		System.out.print("초:");
//		int seconds = scan.nextInt();
//		int min = seconds / 60;
//		int sec = seconds % 60;
//		System.out.println(min + "분 " + sec + "초");
		
		// 4. 1234 자리수 쪼개기
		// 1234 / 1000 => 1.234   몫:1  나머지:234
		// 234 / 100   => 2.34   몫:2  나머지:34
		// 34 / 10     => 3.4   몫:3  나머지:4
//		System.out.print("입력:");
//		int number = scan.nextInt();
		
//		int q = number / 1000;
//		System.out.println(q);  // 1
//		int r = number % 1000;  // 234
//		
//		q = r / 100;  // 2
//		System.out.println(q);
//		r = r % 100;  // 34
//		
//		q = r / 10; // 3
//		System.out.println(q);
//		r = r % 10; // 4
//		System.out.println(r);
		
		// 5. 자리수 쪼개고 합계
		System.out.print("입력:");
		int number = scan.nextInt();
		int sum = 0;
		
		int q = number / 1000; // 1
		int r = number % 1000; // 234
		sum += q;  // sum = sum + q
		
		q = r / 100;  // 2
		r = r % 100;  // 34
		sum += q;
		
		q = r / 10; // 3
		r = r % 10; // 4
		sum += q;
		sum += r;
		
		System.out.println("합계는 " + sum + "입니다.");
	}
}
