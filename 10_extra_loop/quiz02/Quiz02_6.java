package quiz02;

import java.util.Scanner;

public class Quiz02_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("층을 입력하세요:");
		int floor = scan.nextInt();
		
		int jsSec = 0;
		int ghSec = 0;
		int jsSpeed = 7;
		int ghSpeed = 5;
		
		for (int i = 1; i < floor; i++) { // 층을 올라가는 횟수
			if (i % 5 == 0) {
				jsSpeed++; // 5층을 올랐을 때 1초씩 증가
			}
			
			if (i % 4 == 0) {
				ghSpeed += 3; // 4층을 올랐을 때 3초씩 증가
			}
			
			jsSec += jsSpeed;
			ghSec += ghSpeed;
		}
		
		System.out.println("재석:" + jsSec + "초");
		System.out.println("광희:" + ghSec + "초");
	}

}
