import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		

		Scanner 키보드 = new Scanner(System.in);

//영화목록들을 찜하는 ArrayList 를 만든다.
		ArrayList<String> 영화찜목록 = new ArrayList<>();

// 넷플릭스 찜목록
		while (true) {
			System.out.println("====== 넷플릭스 ======");
			System.out.println("1. 영화 추가");
			System.out.println("2. 영화 보기");
			System.out.println("3. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) {
				System.out.println("--- 영화 추가 ---");
				System.out.println(" 1. 브로큰 ");
				System.out.println(" 2. 하얼빈 ");
				System.out.println(" 3. 승부 ");
				System.out.println(" 4. 한산 ");
				System.out.println("추가할 영화 번호를 선택:");
				int 영화선택번호 = 키보드.nextInt();

				if (영화선택번호 == 1) {
					영화찜목록.add("브로큰");
				} else if (영화선택번호 == 2) {
					영화찜목록.add("하얼빈");
				} else if (영화선택번호 == 3) {
					영화찜목록.add("승부");
				} else if (영화선택번호 == 4) {
					영화찜목록.add("한산");
				}
				System.out.println(영화찜목록);
			}else if(메뉴선택==3) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}
}

/*
 * 
 * 🎵 실습 문제: 멜론 플레이리스트 만들기 📖 상황 설명 당신은 멜론 플레이리스트 관리 프로그램을 만들고 있습니다. 현재 플레이리스트에는
 * 아래 3곡이 순서대로 들어있습니다.
 * 
 * 1번째: APT. 2번째: Dynamite 3번째: Supernova 이 플레이리스트를 다음 요청사항대로 수정하는 프로그램을 작성하세요.
 * 
 * 
 * ✅ 요청사항 (순서대로 처리) 1. 노래 추가: 처음에 위 3곡을 순서대로 ArrayList에 담는다 2. 두 번째 위치에
 * "Hype Boy" 삽입: 기존 2번째 자리("Dynamite" 앞)에 "Hype Boy"를 끼워 넣는다 결과 예상: [APT., Hype
 * Boy, Dynamite, Supernova]
 * 
 * 3. "Dynamite" 삭제 - 곡 이름으로 찾아서 삭제한다 결과 예상: [APT., Hype Boy, Supernova] 4.
 * "Attention" 추가 - 리스트 맨 뒤에 새 곡을 추가한다 결과 예상: [APT., Hype Boy, Supernova,
 * Attention]
 * 
 * 각 단계가 끝날 때마다 현재 플레이리스트 전체를 출력해서 어떻게 바뀌는지 눈으로 확인하세요.
 */