package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		// do-while 문: 조건이 거짓이어도 한번은 수행한다.
		int i = 0;
		do {
			System.out.println("안녕 " + i);
			i++;
		} while (i < -1);   // 0 1 2 => 3
		
		// 0 ~ 4 : 5개
		i = 0;
		while (i < 5) {
			System.out.println("와일문 " + i);
			i++;
		}
		
		
		// for (초기식; 조건; 증감식) { }
		for (int j = 0; j < 5; j++) {
			System.out.println("for문 " + j);
		}
		
		// 1 ~ 5: 5개
		for (int j = 1; j <= 5; j++) {
			System.out.println("hello world! " + j);
		}
		
		// 5 ~ 1: 5개
		for (int j = 5; j >= 1; j--) {
			System.out.println("hello world! 5~1 " + j);
		}
		
		// 1+2+ .. +10
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println(sum);
	}
}
