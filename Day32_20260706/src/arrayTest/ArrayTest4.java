package arrayTest;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		int[] 주문금액 = {
			    35000, 120000, 18000, 95000, 150000,
			    42000, 105000, 68000, 12000, 130000,
			    55000, 78000, 99000, 25000, 110000,
			    47000, 89000, 135000, 22000, 64000,
			    51000, 160000, 73000, 28000, 98000,
			    145000, 39000, 87000, 115000, 66000,
			    175000, 31000, 82000, 101000, 58000,
			    92000, 48000, 125000, 71000, 20000
			};
		// 반복문 쓰지 말고! 
		

		// 1. 모든 주문 금액 출력하기

		// 2. 10만원 이상 주문만 출력하기
		//   금액 출력 

		// 3. 가장 큰 주문금액 찾기 

		// 4. 10만원 이상 주문 건수 구하기
		int maxPrice=주문금액[0];
		int count=0;
		
		for(int i=0; i<주문금액.length;i++) {
			System.out.println("주문금액"+주문금액[i]);
			if(주문금액[i]>maxPrice) {
				maxPrice=주문금액[i];
			}
			
		}
		
		for(int i=0; i<주문금액.length;i++) {
			if(주문금액[i]>=100000){
			System.out.println("10만원이상 주문:"+i+"번 고객"+주문금액[i]);
			count+=1;
			}
			
		}
		System.out.println("가장 큰 주문 금액:"+maxPrice);
		System.out.println("10만원 이상 주문 건수:"+count);
		
		
		//실습
		boolean[] 로그인성공여부 = 
			{true, false, true, true, false, false, true, true, false, true};
		int failCount=0;
		for(int i=0; i<로그인성공여부.length;i++) {
			if(!로그인성공여부[i]) {
				failCount++;
			}
		}
		System.out.println("로그인 실패율: "+((double)failCount/로그인성공여부.length*100)+"%");
		





		
		

	}

}
