package quiz01;

public class Quiz01_6 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) { // 행: 5개의 행  5 4 3 2 1
			for (int j = i; j >= 1; j--) { // 별의 수: i개와 같다. 
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
