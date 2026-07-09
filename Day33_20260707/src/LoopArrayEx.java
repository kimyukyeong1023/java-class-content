import java.util.Scanner;

public class LoopArrayEx {

	public static void main(String[] args) {

// 배열과 반복문 합치면 난이도 업!
// 커피는 순서대로 나온다! 
// 1. 커피주문 

		String[] cust = { "얼음공주", "집에가고싶다", "1234", "까칠한민수!", "눈뜨니 회사네", "여왕님" };

// while 을 이용해서 현재 주문이 들어온 고객들의 닉네임을
// 가지고 와서 메뉴 나왔습니다. 출력!
		int 공간번호 = 0;

		while (공간번호 <= 5) {
			System.out.println(cust[공간번호]);
			공간번호 += 1;
		}
//  쇼핑몰에서 현재 멤버들한테 15% 할인쿠폰이 도착했습니다.
//  출력 
		String[] members = { "김철수", "이영희", "박민수", "최지은", "홍길동" };

		int 번호 = 0;
		while (번호 < members.length) {
			System.out.println(members[번호] + "15% 할인쿠폰이 도착했습니다");
			번호 += 1;
		}

// 배열 = 여러개의 데이터를 저장한다
// 반복문 = 같은 일을 여러번 시킨다
// 배열 + 반복문 = 여러개의 데이터를 하나씩 꺼내면서
//               같은 작업을 수행한다.
// 목록! 보여주는 프로그램에서는 많이 사용한다.

//회원가입할 때 아이디 중복검사하는 로직!
// 사용자가 입력한 아이디가 이미 다른 사람이 
// 사용중인지 확인하는 기능! 
		Scanner 키보드 = new Scanner(System.in);

		String[] 기존아이디 = { "apple", "banana", "cherry" };
		String 새로가입하는아이디 = 키보드.nextLine();
		int i=0;
		boolean flag=false;
		while(i<기존아이디.length) {
			if(새로가입하는아이디.equals(기존아이디[i])) {
				flag=true;
				break;
			}
			i++;
		}
		if(flag) {
			System.out.println("아이디중복");
		}else {
			System.out.println("사용 가능한 아이디");
		}
		

	}
}