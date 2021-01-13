package condition_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// if - else 문
		System.out.print("몸무게를 입력하세요:");
		int weight = scan.nextInt();
		
		// 몸무게가 70키로 이하이면 치킨, 아니면 샐러드 
		if (weight <= 70) {
			System.out.println("치킨 먹자!!!");
		} else {
			System.out.println("샐러드 먹자!!!");
		}
		
		// if - else if - else 문
		if (weight <= 70) {  // 70이하
			System.out.println("치킨 먹자!");
		} else if (weight <= 75) { // 70초과 75이하
			System.out.println("닭가슴살 먹자!");
		} else if (weight <= 80) { // 75초과 80이하
			System.out.println("샐러드 먹자");
		} else { // 80초과
			System.out.println("굶자");
		}
	}
}
