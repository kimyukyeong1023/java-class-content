public class OperatorTest {

	public static void main(String[] args) {
		int 내가구매한금액=8000;
		System.out.println(내가구매한금액>=10000?
								"묶음배송"
								:"배송비3000원");
		
		
		System.out.println();

// 조건 ? true 태그보여줘 : false 태그보여줘
// 삼항연산자 
//  조건에 따라 두 가지 결과 중 하나를 선택하는 연산자(기호)
// 조건이 맞으면 앞에 있는 값,
// 조건이 맞지 않으면 뒤에 있는 값을 보여준다.
// 비교했을 때 true, false 결과를 주는 기호들! 

// 로그인 했을 때 로그인 성공이면 <p>환영합니다</p>
//                   실패이면 <p>아이디또는 비밀번호확인</p>
		System.out.println(10 >= 5 ? "맞다!" : "틀리다");

// 값을 무조건 1씩만 감소하거나 증가하는 연산자(기호)
//  ++변수명, --변수명 
		int 숫자 = 10;

		System.out.println("초기값: " + 숫자);
		System.out.println("1증가하기:" + (++숫자));
// 숫자 = 숫자 +1;  숫자 += 1; 

		int 숫자2 = 10;
		System.out.println("초기값: " + 숫자2);
		System.out.println("1감소하기:" + (--숫자2));

// 실제 웹 개발에서 사용하는 곳!
// 좋아요, 장바구니 수량, 게임 목숨

// 2씩 더하기 , 10씩 더하기 
// 숫자 + 2;  숫자 + 10;
	}
}