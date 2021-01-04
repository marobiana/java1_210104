package quiz02;

public class Quiz02_4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = i; j <= 6; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}

}
