package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		int noodleCup = 850;
		System.out.println("육개장 가격:" + noodleCup);
		
		// 3개 가격 계산
		// 육개장 가격:850, 육개장 3개의 가격:OOO
		int sum = noodleCup * 3;
		System.out.println("육개장 가격:" + noodleCup + ", 육개장 3개의 가격:" + sum);
		
		// 10,000원으로 육개장 3개를 산 후 거스름돈 구하기
		int money = 10000;
		int change = money - sum;
		System.out.println("거스름돈:" + change);
		
		// 5,000원으로 육개장을 몇 개 살 수 있고, 거스름돈은 얼마나 남는가?
		// 몇 개 살 수 있는지 : 5,000 / 육개장 하나의 가격  몫  /
		// 거스름돈 : 5,000 / 육개장 하나의 가격   나머지   %
		money = 5000;
		int buyNoodleCup = money / noodleCup;
		System.out.println("살 수 있는 개수:" + buyNoodleCup);
		
		change = money % noodleCup;
		System.out.println("거스름돈:" + change);
	}

}
