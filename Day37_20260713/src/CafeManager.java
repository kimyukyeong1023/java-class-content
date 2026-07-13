import java.util.ArrayList;
import java.util.Scanner;

class 고객정보{
	String 이름;
	String 전화번호;
	int 포인트;
	public 고객정보(String 이름, String 전화번호) {
		this.이름 = 이름;
		this.전화번호 = 전화번호;
		this.포인트 = 0;
	}
	
}

public class CafeManager {

public static void main(String[] args) {
/*
 * 
 * 카페 포인트 적립 — 상황
 * 고객 정보
 *  이름,전화번호,포인트 
 * 
 * 
 * 전화번호 하나로 여러 정보를 관리하는 상황 
 * (등록 → 적립 → 조회) 등록 시점엔 이름,
 * 전화번호만 알고, 포인트는 아직 없음 (이제 막 가입했으니까)
 * 
 * 기본값 필드기본값왜 이 값인지 이름(직접 입력)등록 
 * 시점에 이미 앎 전화번호(직접 입력)등록 시점에 이미 앎
 * 포인트 0  방금 가입했으니 적립된 게 없음
 * 
 * 
 * System.out.println("\n===== 메뉴 =====");
            System.out.println("1. 고객 등록");
            System.out.println("2. 포인트 적립");
            System.out.println("3. 포인트 조회");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            

            실행 순서!(파이브라인)
1) 프로그램 시작 → ArrayList<고객> 고객목록 준비
   ↓
2) while(true)로 메뉴 반복 출력
   ↓
3) 사용자가 번호 입력 (nextInt) → 개행 제거 (nextLine)
   ↓
4) 선택값에 따라 분기
   ├─ 1: 고객등록 → 이름/전화번호 입력 → new 고객(이름, 전화번호) 생성
   │              (포인트는 매개변수로 안 받고 생성자 안에서 0으로 자동 설정)
   │              → 고객목록.add()
   │
   ├─ 2: 포인트적립 → 전화번호/적립포인트 입력
   │              → 고객목록 반복 순회 (while + get(번호))
   │              → 전화번호 일치하는 고객 찾기
   │              → 찾으면 대상.포인트 += 적립포인트 → break
   │              → 못 찾으면 "등록된 고객이 아닙니다"
   │
   ├─ 3: 포인트조회 → 전화번호 입력
   │              → 고객목록 반복 순회
   │              → 전화번호 일치하는 고객의 이름+포인트 출력
   │
   └─ 0: 종료 → break → 프로그램 종료
   ↓
5) 종료 아니면 2번으로 돌아가서 메뉴 다시 출력 (반복)
 */
	Scanner 키보드=new Scanner(System.in);
	ArrayList<고객정보> 고객목록=new ArrayList<>();
	
	while(true) {
		 System.out.println("\n===== 메뉴 =====");
	     System.out.println("1. 고객 등록");
	     System.out.println("2. 포인트 적립");
	     System.out.println("3. 포인트 조회");
	     System.out.println("0. 종료");
	     System.out.print("선택: ");
	     
	     int 메뉴선택=키보드.nextInt();
	     키보드.nextLine();
	     
	     if(메뉴선택==1) {
	    	 System.out.print("이름 입력: ");
	    	 String 입력이름=키보드.nextLine();
	    	 System.out.print("전화번호 입력: ");
	    	 String 입력전화번호=키보드.nextLine();
	    	 고객목록.add(new 고객정보(입력이름,입력전화번호));
	    	 
	     }else if(메뉴선택==2) {
	    	 System.out.print("전화번호 입력: ");
	    	 String 포인트전화번호=키보드.nextLine();
	    	 System.out.print("적립포인트 입력: ");
	    	 int 적립포인트=키보드.nextInt();	  
	    	 키보드.nextLine();
	    	 
	    	 int i=0;
	    	 boolean 존재여부=false;
	    	 
	    	 while(i<고객목록.size()) {
	    		 고객정보 고객한명= 고객목록.get(i);
	    		 if(고객한명.전화번호.equals(포인트전화번호)) {
	    			 고객한명.포인트+=적립포인트;
	    			 존재여부=true;
	    			 break; 
	    		 }
	    		 i++;
	    	 }
	    	 if(!존재여부) {
	    		 System.out.println("등록된 고객이 아닙니다");
	    	 }
	    	 
	     }else if(메뉴선택==3) {
	    	 System.out.print("전화번호 입력: ");
	    	 String 조회전화번호=키보드.nextLine();
	    	 
	    	 int i=0;
	    	 boolean 존재여부2=false;
	    	 while(i<고객목록.size()) {
	    		 고객정보 고객한명= 고객목록.get(i);
	    		 if(고객한명.전화번호.equals(조회전화번호)) {
	    			 System.out.println(고객한명.이름+"님의 현재 포인트는 "+고객한명.포인트);
	    			 존재여부2=true;
	    			 break;
	    			 
	    		 }
	    		 i++;
	    	 }
	    	 if(!존재여부2) {
	    		 System.out.println("등록된 고객이 아닙니다");
	    	 }
	    	 
	     }else if(메뉴선택==0) {
	    	 System.out.println("종료합니다");
	    	 break;
	     } 
		
	}

     
	}

}