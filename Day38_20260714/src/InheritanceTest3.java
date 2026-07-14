import java.util.ArrayList;

/*
 * 사람에 대한 정보를 저장하는 클래스들
 * 
 * 학생 클래스 (Student)
 *  - 이름,나이,키,몸무게,학년, 전공
 *  
 * 직원 클래스  (Employee)
 *  - 이름,나이,키,몸무게,급여, 부서
 * 
 * 여러분들이 공통되는 클래스 만들고 상속 받아서 
 * 각각의 내용들이 추가되서 출력될 수있도록!
 * 코드를 작성 하시오!
 * 
 *  학생 정보
 *  이름    나이 신장    몸무게  학년 전공
강건강	20	178.2	70.0	1	정보시스템공학과
남나눔	21	187.3	80.0	2	경영학과
류라라	23	167.0	45.0	4	정보통신공학과
직원 정보
이름	나이	신장	몸무게	급여	부서
박보배	26	180.3	72.0	100000000	영업부
송성실	38	182.0	76.0	200000000	기획부
 * 
 */

class Person{
	String name;
	int age;
	double height;
	double weight;

}
class Student extends Person{
	int 학년;
	String 전공;
	
	public Student(String name,int age,double height,double weight,int 학년,String 전공) {
		super.name=name;
		super.age=age;
		super.height=height;
		super.weight=weight;
		this.학년=학년;
		this.전공=전공;
	}

	void outInfo() {
		System.out.printf("%s %d %f %f %d %s\n",name,age,height,weight,학년,전공);
	}
}
class Employee extends Person{
	int 급여;
	String 부서;
	public Employee(String name,int age,double height,double weight,int 급여,String 부서) {
		super.name=name;
		super.age=age;
		super.height=height;
		super.weight=weight;
		this.급여=급여;
		this.부서=부서;
		
	}
	
	void outInfo() {
		System.out.printf("%s %d %f %f %d %s\n",name,age,height,weight,급여,부서);
	}
	
	
}

class 어린이 {

	String 이름;

// 생성자 - 실제 메모리공간을 확보하고 값을 저장해라!
// 생성자역할
//  1. 객체 만들기
//  2. 객체 변수들에 값을 저장하기 (설정)
//  객체를 만드는 조금 특별한 함수다!

// 클래스변수 이름, 데이터를 전달하는 변수 이름이 똑같은것!
// 괄호안에 있는 변수는 main에서 데이터를 전달하는 역할
// 클래스 안에 변수들은 각각 생성되는 데이터를 저장하는 역할 변수!
	어린이(String 이름) {
// 나는 클래스 변수에 저장
// = 대입연산자(저장) 실행하는 순서 
//   오른쪽에서 왼쪽으로 저장!
// 왼쪽은 클래스 변수에 각각 저장해야되기때문에 this
// 객체 자기 자신!
// this.이름 이거는 클래스변수 이름변수다!
// this는 객체를 만들고 나서 메모리 주소다!
// 변수들의 기준! 
//  잠깐 데이터를 전달만 하고 끝나니?
//  계속 가지고 있어야되는 진짜 데이터니?
		this.이름 = 이름;
	}
}
/*
 * 잠깐 데이터를 전달만 하고 끝나니? 배달 주문 수량- 음식을 만들고 나면 끝나요! (매개변수) 피자 두판 주세요! 김치찌개 한그릇 주세요!
 * 계산기에 입력하는 숫자들 엘리베이터 층수 버튼 택시 탑승하면 목적지
 * 
 * 계속 가지고 있어야되는 진짜 데이터니? 회원 정보 택시 정보 은행 계좌
 */

public class InheritanceTest3 {

	public static void main(String[] args) {
		
		ArrayList<Student> 학생목록=new ArrayList<>();
		ArrayList<Employee> 직원목록=new ArrayList<>();
		학생목록.add(new Student("강건강",20,178.2,70.0,1,"정보시스템공학과"));
		학생목록.add(new Student("남나눔",21,187.3,80.0,2, "경영학과"));
		학생목록.add(new Student("류라라",23,167.0,45.0,4,"정보통신공학과"));
		직원목록.add(new Employee("박보배",26,180.3,72.0,100000000,"영업부"));
		직원목록.add(new Employee("송성실",38,182.0,76.0,200000000,"기획부"));
		
		for(Student 학생:학생목록) {
			학생.outInfo();
		}
		for(Employee 직원:직원목록) {
			직원.outInfo();
		}
		

	}
}