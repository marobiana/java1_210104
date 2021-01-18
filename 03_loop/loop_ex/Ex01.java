package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// "안녕하세요" 3번 출력하기
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		// 반복문
		int i = 0; // 카운팅을 위한 변수
		while (i < 3) { // 조건이 참일 때 수행되고 조건이 거짓이 되었을 때 빠져 나온다.
			System.out.println("안녕하세요 " + i);
//			i = i + 1;    
//			i += 1;   // 복합 대입 연산자
			i++;  
		}
    
    // ++i와  i++ 차이점 
		i = 10;
		System.out.println("i:" + (++i)); // 11
		System.out.println("i:" + (i++)); // 11 : 다음 행에서 i = i + 1이 된다.
		System.out.println(i);
		
		// 0 ~ 4 : 5번
		i = 0;
		while (i < 5) {
			System.out.println("hello world! " + i);
			i++;
		}
		
		// 1 ~ 5 : 5번
		i = 1;
		while (i <= 5) {  // 1 2 3 4 5  
			System.out.println("안녕 " + i);
			i++;
		}
		
		// 5 ~ 0 : 6번
		i = 5;
		while (i >= 0) {  // 5 4 3 2 1 0
			System.out.println("Hello world " + i);
			i--;
		}
		
		// 1+2+3+4+...+10
		int sum = 0;
		i = 1;
		while (i <= 10) { // 1 2 3 4 5 6 7 8 9 10
			//sum = sum + i;
			int a = 10;
			sum += i;
			i++;  // 증감은 맨 마지막에 한다
			System.out.println(sum);
		}
 	}

}
