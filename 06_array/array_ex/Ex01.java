package array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(array): 같은 자료형 변수들의 묶음
		// 배열의 초기화 (1)
		int[] scores = {89, 93, 91, 93, 100};
		System.out.println("첫번째 값:" + scores[0]);
		System.out.println("두번째 값:" + scores[1]);
		System.out.println("세번째 값:" + scores[2]);
		System.out.println("네번째 값:" + scores[3]);
		System.out.println("다섯번째 값:" + scores[4]);
		
		// 배열의 초기화(2)
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		numbers[2] = 1000;
		System.out.println(numbers[2]);
		System.out.println(numbers); // 해시값
		
		// 반복문을 이용한 배열값 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 합계 구하기
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("합은 " + sum);
	}

}
