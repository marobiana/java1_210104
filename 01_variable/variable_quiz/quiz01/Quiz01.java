package variable_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 * 이름: 신보람 나이: 25

			3 + 5 = 8
			3 - 5 = -2
			
			7 X 1 = 7
			7 X 2 = 14
			7 X 3 = 21
		 * */
		int age = 25;
		System.out.println("이름: 신보람 나이: " + age + "\n");
		System.out.println("3 + 5 = " + (3 + 5));
		int result = 3 - 5;
		System.out.println("3 - 5 = " + result + "\n");
		
		int number = 7;
		System.out.println(number + " X 1 = " + (7 * 1));
		System.out.println(number + " X 2 = " + (7 * 2));
		System.out.println(number + " X 3 = " + (7 * 3));
	}

}
