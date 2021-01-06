package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형(data type) 변환  => casting
		double pi = 3.14;
		int intPi = (int)pi; // double -> int로 변환: 소수점 뒷자리 값 버림
		System.out.println(intPi);
		
		int number = 7;
		double result = number / 2; // 예상값: 3.5, 결과: 3.0
		System.out.println(result);
		
		// 1. 둘 중 하나의 값을 실수로 형변환(casting)을 한다.
		result = number / (double)2;
		System.out.println(result);
		
		// 2. 실수로 나눈다.
		result = number / 2.0;
		System.out.println(result);
		
		
		// 반올림 하는법
		// Math.round(실수) => 3.14 = 3     3.8 = 4
		pi = 3.141592653;
		System.out.println(Math.round(pi));
		
		// 둘째자리까지 반올림 해서 나타내는 방법
		// 1. pi에 100을 곱해서 314.1592653 만든다.
		// 2. 소수점 첫째자리에서 반올림해서 정수를 만든다.  => 314
		// 3. 3.14로 만들기 위해 100.0을 나누어준다.
		System.out.println(Math.round(pi * 100) / 100.0);
	}
}
