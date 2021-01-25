package quiz02;

import java.util.Scanner;

public class Quiz02_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		
		int clap = 0;
		for (int i = 1; i <= number; i++) {
			int ten = i / 10;
			int one = i % 10;
			if (one == 3 || one == 6 || one == 9) {
				clap++;
			}
			if (ten == 3 || ten == 6 || ten == 9) {
				clap++;
			}
		}
		System.out.println(clap);
	}

}
