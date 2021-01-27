package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 두 개의 주사위를 굴렸을 때, 나올 수 있는 모든 경우의 수를 출력하세요.
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
		
		// 2. 구구단
		// 앞의 수: 2 ~ 9 단수 , 뒤에있는 수 : 1 ~ 9 곱해지는 수
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
		// 3. 별 삼각형
		// *        - 1행,  별 1
		// **       - 2행,  별2
		// ***      - 3행,  별3
		// ****
		// *****    - 5행,  별5
		// 행의 번호와 별의 개수가 같다.
		for (int i = 1; i <= 5; i++) {  // 행  1 ~ 5     1 2 3
			for (int j = 1; j <= i ; j++) {   // 별의 개수 - 행의 개수 까지만 반복문을 돌린다.
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
