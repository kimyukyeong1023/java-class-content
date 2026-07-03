import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		//키보드 객체 생성
		
		Scanner a= new Scanner(System.in);
		//숫자 입력 Scanner클래스형 객체인 a에서 정수형 테이터를 입력받는 
		//nextInt()메서드 사용해서 정수형 데이터 반환
		System.out.println("나이를 입력하세요.");
		 int 나이=a.nextInt();
		 //처리
		 //예외처리 -20, 문자
		 if(나이>=20) {
			 System.out.println("성인");
		 }else {
			 System.out.println("청소년");
		 }


	}

}
