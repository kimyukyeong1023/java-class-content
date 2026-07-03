public class OperatorTest2 {

	public static void main(String[] args) {
// 실제 웹에서 사용하는 기법!
// 좋아요
// 브라우저는 누구든 접근이 가능하다(개발자도구)
// 자바로 만들면 브라우저에 저장이 아니라 내 컴퓨터
// 메모리에 저장이 되기 때문에 누구든 접근이 불가능하다
		int 배터리=30;
		
		System.out.println("배터리:"+배터리);
		String result=배터리<=30? 
					"충전하세요":
						"30퍼이상";
		System.out.println(result);
		
		System.out.println();
		System.out.println();

		int 좋아요 = 100;
		System.out.println("현재 좋아요: " + 좋아요);

		++좋아요;

		System.out.println("좋아요버튼 클릭!");
		System.out.println("현재 좋아요: " + 좋아요);

// 좋아요가 100개 이상이면 "인기게시글!"
//              미만이면 "아직 인기 게시글 아님"
		boolean 결과=좋아요>=100;
		String 메시지=결과? 
				"인기게시글!":
					"아직 인기 게시글 아님";
		System.out.println(메시지);
	

	}
}