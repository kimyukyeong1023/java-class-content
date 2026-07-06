package StringTest;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {

// replace("찾을값","바꿀값");
//  - 특정 문자를 찾아서 다른 문로 전부 바꿔주는 기능
		String message = "안녕 안녕 안녕";

// hello 로 영어로 변경 하고 싶다.
		String result3 = message.replace("안녕", "hello");
		System.out.println(result3);
		
		String phone="010-1234-1234";
		String result4=phone.replace("-","");
		System.out.println(result4);
		
		String[] badWords = {"바보", "멍청이", "짜증"};
		String comment = "너 진짜 바보 같고 짜증나";

		System.out.println("필터링전: "+ comment);

		for(String wo : badWords) {
		comment = comment.replace(wo, "***");
		}
		System.out.println("필터링 후: "+comment);

// split("구분자")
//  - 문자 여러개를 원하는 기준으로 여러 개로
//    나눌 수있다.

		String userEmail = "student99@yonsai.com";

		String[] result2 = userEmail.split("@");

		System.out.println(result2[0]);
		System.out.println(result2[1]);

		System.out.println();
		System.out.println();
		String fus = "사과,바나나,포도";

		String[] result = fus.split(",");

		System.out.println(Arrays.toString(result));
		for (String f : result) {
			System.out.println(f);
		}

	}
}