package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 주석 : 설명
		// 아무 글자 ........
		// 한 줄 주석
		/*  
		 * 여러줄
		 *    주석
		 *      입니다.
		 *    */
		System.out.print("Hello world!\n\n\n");
		System.out.println("Hello world!");
		
		// 정수형 변수(Integer)
		int number1 = 3;  // 초기화
		System.out.println(number1);
		
		number1 = 5;
		System.out.println(number1);
		
		int number2 = 100;
		int sum = number1 + number2;
		System.out.println(sum);
		
		// 실수 변수: float => 권장 안함. 오차있음
		float f = 1.5f;
		double d = 1.5;
		System.out.println(number2 * d);
		
		// 문자 변수: character 작은 따옴표로 감싼다.
		char c = 'a';
		System.out.println(c);
		
		// boolean 변수 : 참(true) 또는 거짓(false)
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println(isFalse);
	}

}
