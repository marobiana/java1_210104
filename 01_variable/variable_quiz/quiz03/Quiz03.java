package variable_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 국어 : 93 수학 : 88 영어 : 94
		int korean = 93;
		int math = 88;
		int english = 94;
		double average = (korean + math + english) / (double)3; // 91.67
		average = Math.round(average * 100) / (double)100;
		System.out.println("국어:" + korean + "점, 수학:" + math + "점, 영어:" + english + "점");
		System.out.println("평균:" + average);
		
		// 2. 섭씨 to 화씨 
		//화씨 온도 = 9 / 5 * 섭씨온도 + 32
		int c = 30;
		double f = 9 / 5 * c + 32;
		System.out.println("섭씨 " + c + "도는 화씨 " + f + "도 입니다.");
	}
}
