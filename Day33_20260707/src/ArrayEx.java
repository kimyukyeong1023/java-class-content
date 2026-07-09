import java.util.ArrayList;

public class ArrayEx {

	public static void main(String[] args) {
// 코드를 정렬해서 보는것도 중요하다
// 자동 코드 정렬 ctrl + shift + f

// 배열 
//  장점 = 여러개의 데이터를 저장하는 것!
//        순서대로!
//  단점 - 처음 한번 데이터를 저장하면 늘릴수도없고
//        삭제도 못한다. 
		int[] nums = { 10, 20, 30, 40, 50, 60 };

// 아무런 데이터도 없다! 공간만 만든다.
// int[] nums2 = new int[100];
// String[] stus = new String[100];
//
// 리스트 
//  - 배열처럼 여러개의 데이터를 저장할 수있다.
//  - 추가도 가능하고 삭제도 가능하다!
// ArrayList 
//  - 미리 많이 만들지 말고 그때그때 필요한 만큼
//    만들어서 사용해라!
//  new 새롭게 만들어라! 
//  ArrayList라는 타입을 만들어라!
//  new ArrayList<>(); 자바스크립트 []
//  let -> ArrayList<String> 문자들을 자유롭게
//         추가하고 삭제하는 배열을 만들어라!
		ArrayList<String> 리스트 = new ArrayList<>();

// 리스트 사이즈 확인 
		System.out.println("리스트 사이즈:" + 리스트.size());

// 추가 
		리스트.add("에리나");
		리스트.add("그레이스");
		리스트.add("알렉스");
		

		System.out.println("리스트 사이즈:" + 리스트.size());
// 전체 출력 
		System.out.println(리스트);

// 삭제 
		리스트.remove("그레이스");
		System.out.println(리스트);

	}
}