package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// break: break가 써진 곳의 가장 가까운 반복문에서 빠져나온다.
		
		// Hello world
		int i = 0;
		while (true) {  // 0 1 2 3 4  => 5번
			if (i == 5) {
				break;
			}
			
			System.out.println("hello world " + i);
			i++;
		}
		
		for (int j = 0; true; j++) {
			if (j == 5) {
				break;
			}
			System.out.println("hello world(for) " + j);
		}
		
		
		// 1 ~ 10까지의 수 중에서 4의 배수일 때는 숫자를 출력하지 않기
		// 1 2 3 5 6 7 9 10
		// (1) if문으로 처리
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		
		// continue: 아래 코드들을 수행하지 않고 가까운 반복문에서 빠져나온다.(skip)
		for (int j = 1; j <= 10; j++) {
			if (j % 4 == 0) {
				continue;    // skip
			}
			System.out.println(j + " ");   // 4의 배수가 아님
		}
	}
}
