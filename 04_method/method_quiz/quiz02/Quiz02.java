package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 메소드 사용하는 곳
		Scanner scan = new Scanner(System.in);
		// 1. 합, 100까지만
//		System.out.print("수를 입력하세요:");
//		int num = scan.nextInt();
//		int sum = getSumUntil100(num); // 전달 인자값 argument
//		System.out.println(sum);

		// 2. 5개 수 중에 최소값
//		System.out.print("5개의 수를 입력하세요:");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		int num5 = scan.nextInt();
//		
//		printMin(num1, num2, num3, num4, num5);
		
		// 3. 
	}

	// 메소드 만드는 곳
	// 1.
	public static int getSumUntil100(int num) { // parameter 매개변수
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
				break;
			}
		}
		return sum;
	}
	
	// 2.
	public static void printMin(int num1, int num2, int num3, int num4, int num5) {
		int min = num1;
		if (min > num2) {
			min = num2;
		} 
		if (min > num3) {
			min = num3;
		}
		if (min > num4) {
			min = num4;
		}
		if (min > num5) {
			min = num5;
		}
		System.out.println("최소값은 " + min);
	}
	
	// 3.
	public static boolean isPrimeNumber(int num) {
		// 2 3 5 7 
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // 소수가 아닌 경우
			}
		}
		
		// 여기까지 도달하면 나누어진 수가 없으므로 소수
		// 2의 경우 반복문에 들어가지 않으므로 소수
		return true;  // 소수
	}
}
