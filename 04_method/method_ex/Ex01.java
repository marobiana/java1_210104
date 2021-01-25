package method_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 사용 하기
		
		int max = Math.max(10, 5);  // 전달 인자 값 , argument
		System.out.println(max);
		System.out.println(Math.max(10, 5));
		
		// 반올림
		double d = 3.68435;
		long roundNumber = Math.round(d);
		System.out.println(roundNumber);
		System.out.println(Math.round(d));
		
		// 절대값
		int num = Math.abs(-10);
		System.out.println(num);
	}

}
