package two_d_array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 2차원 배열
		// 앞:행, 뒤:열
		int[][] scores = {{89, 93, 82}, {91, 100, 82}, {98, 91, 94}};
		System.out.println("3번째 학생의 두번째 점수는? " + scores[2][1]); // 91
		System.out.println("2번째 학생의 세번째 점수는? " + scores[1][2]); // 82
		System.out.println("1번째 학생의 세번째 점수는? " + scores[0][2]); // 82
		
		for (int i = 0; i < scores.length; i++) {  // 학생
			for (int j = 0; j < scores[i].length; j++) {  // 과목
				// n번째 학생의 n번째 점수는 OO
				System.out.println((i+1) + "번째 학생의 " + (j+1) + "번째 점수는 " + scores[i][j]);
			}
		}
		
		// 학생들의 평균점수 구하기
		for (int i = 0; i < scores.length; i++) { // 학생
			int sum = 0; // 한 학생당 점수 총합
			for (int j = 0; j < scores[i].length; j++) { // 과목
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			System.out.println((i+1) + "학생의 평균은 " + average);
		}
	}

}
