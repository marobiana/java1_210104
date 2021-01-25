package loop_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("자연수 입력: ");
		int num = scan.nextInt();
		int count = 0;
	
    // (1)
		while (num != 0) {
			num = num / 10;
			count++;
		}
		
		System.out.println(count);
    
    // (2)
		int num2 = 0;
    int count2 = 0;
		for(int i = 1; num2 >= i; i *= 10) {
			 count2++;
		}

		System.out.println(count2);
	}

}




   
