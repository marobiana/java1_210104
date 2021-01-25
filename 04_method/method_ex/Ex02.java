package method_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 메소드 만들기
		// 1. 어떤 함수를 만들지 이름을 짓는다.(동사)
		// 2. input 무엇을 받을건지 생각한다.
		// 3. output 무엇을 돌려줄건지 생각한다.
		// 4. 구현한다.
		
		int a = 3;
		int b = 5;
		int result = sum(a, b);  // argument : 전달 인자값
		System.out.println(result);
		
		printHelloWorld();
	}
	
	public static int sum(int x, int y) {   // parameter : 매개 변수
		//int result = x + y;
		return x + y; // 메소드 종료
	}

	public static void printHelloWorld() {
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		return; // 메소드 종료
	}
}
