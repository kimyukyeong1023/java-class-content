import java.util.ArrayList;
import java.util.Scanner;

 class ChMenu { 
	String menu="";
	String size="";
	@Override
    public String toString() {
        // 화면에 출력하고 싶은 모양대로 글자를 조립해서 return 해줍니다.
        return "커피 이름: " + name + " / 가격: " + price + "원";
}

public class cafeEx {
	
	static Scanner input=new Scanner(System.in);
	static ArrayList<ChMenu> coffeeList=new ArrayList<>();
	static ChMenu coffee=new ChMenu();
	public static int Coffee() {
		int priceCoffee=0;
		
		System.out.println("커피선택");
		System.out.println("1.아메리카노");
		System.out.println("2.카페모카");
		System.out.println("3.카페라떼");
		System.out.println("4.그린티라떼");
		
		int choiceCoffe=input.nextInt();
		
		if(choiceCoffe==1) {
			priceCoffee+=3900;
			coffee.menu="아메리카노";
		}else if(choiceCoffe==2) {
			priceCoffee+=1500;
			coffee.menu="카페모카";
		}else if(choiceCoffe==3) {
			priceCoffee+=5000;
			coffee.menu="카페라떼";
		}else if(choiceCoffe==4) {
			priceCoffee+=5500;
			coffee.menu="그린티라떼";
		}else {
			System.out.println("없는메뉴입니다");
		}
		if (coffee.menu!="") {
			coffeeList.add(coffee);
		}
		return priceCoffee;
		
	}
	
	public static int size() {
		int priceSize=0;
		System.out.println("커피선택");
		System.out.println("1.G");
		System.out.println("2.R");
		System.out.println("3.S");
		
		
		int choiceSize=input.nextInt();
		
		if(choiceSize==1) {
			priceSize+=1000;
			coffee.size="G";
		}else if(choiceSize==2) {
			priceSize+=500;
			coffee.size="R";

		}else if(choiceSize==3) {
			priceSize+=0;
			coffee.size="S";

		}else  {
			System.out.println("없는 사이즈입니다.");
		}
		
		return priceSize;
	}
	
	public static void price(int a, int b) {
		int totalPrice=a+b;
		for(coffeeO:coffeeList) {
			System.out.println(coffeeO);
		}
		
		System.out.println("총금액은: "+totalPrice+"원 입니다.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=Coffee();
		int b=size();
		price(a,b);

	}

}
