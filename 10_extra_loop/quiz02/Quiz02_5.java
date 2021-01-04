package quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		System.out.println("2020 / 7\n");
		System.out.println(" S  M  T  W  T  F  S");
		
		int day = -2;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (day < 1) {
					System.out.print("  ");
				}
				
				if (day < 10) {
					System.out.print(" ");
				}
				
				if (day >= 1) {
					System.out.print(day + " ");
				}
				day++;
				
				if (day > 31) {
					break;
				}
			}
			System.out.println();
		}
	}

}
