package com.yonsai.project.service;

import java.util.HashMap;

class Student {
    String studentId;
    String name;
    int score;
}

class Book {
    String isbn;
    String title;
    String author;
    int stock;
}

class Dog2 {

    private String dogId;
    private String name;
    private String breed;
    private boolean isAdopted;  // 입양 여부
	public Dog2(String dogId, String name, String breed, boolean isAdopted) {
		super();
		this.dogId = dogId;
		this.name = name;
		this.breed = breed;
		this.isAdopted = isAdopted;
	}
	
	public void adopt() {
		isAdopted=true;
		
	}
	public String getDogId() {
		return dogId;
	}
    
}

public class MapEx {
	
	HashMap<String, Student> studentMap=new HashMap<>();
	HashMap<String, Book> bookMap=new HashMap<>();
	HashMap<String, Dog2> dogMap=new HashMap<>();
	
	
	public void std () {
		Student std1= new Student();
		// (예: "s001", "김민지", 95 / "s002", "이도현", 88)
		std1.studentId="s001";
		std1.name="김민지";
		std1.score=95;
		
		Student std2= new Student();
		std2.studentId="s002";
		std2.name="이도현";
		std2.score=88;
		
		studentMap.put(std1.studentId, std1);
		studentMap.put(std2.studentId, std2);
		
		System.out.println("이름: "+studentMap.get("s001").name);
		System.out.println("점수: "+studentMap.get("s001").score);
		
	}
	public void book() {
		//(b001, 자바의 정석, 남궁성, 재고 10) 
		//(b002, 이펙티브 자바, 조슈아 블로크, 재고 5) 
		Book bk1=new Book();
		bk1.isbn="b001";
		bk1.title="자바의 정석";
		bk1.author="남궁성";
		bk1.stock=10;
		
		bookMap.put("b001", bk1);
		Book bk2=new Book();
		bk2.isbn="b002";
		bk2.title="이펙티브 자바";
		bk2.author="조슈아 블로크";
		bk2.stock=5;
		
		bookMap.put("b002", bk2);
		
		String searchBName="b001";
		
		System.out.println("제목: "+bookMap.get(searchBName).title);
		System.out.println("재고: "+bookMap.get(searchBName).stock);
		bookMap.get(searchBName).stock--;
		System.out.println("변경후 재고: "+bookMap.get(searchBName).stock);

		
		
		
	}
	
	//Dog 객체 1(d001, 초코, 말티즈, false) 생성 후 필드 값 대입 → 강아지들.put("d001", 강아지1)
//Dog 객체 2(d002, 몽이, 푸들, false) 생성 후 필드 값 대입 → 강아지들.put("d002", 강아지2)
//Dog 객체 3(d003, 보리, 진돗개, false) 생성 후 필드 값 대입 → 강아지들.put("d003", 강아지3)
	public void dog() {
		Dog2 dog1=new Dog2("d001", "초코", "말티즈", false);
		dogMap.put(dog1.getDogId(), dog1);
		Dog2 dog2=new Dog2("d002", "몽이", "푸들", false);
		dogMap.put(dog2.getDogId(), dog2);
		Dog2 dog3=new Dog2("d003", "보리", "진돗개", false);
		dogMap.put(dog3.getDogId(), dog3);
		
		String searchDogId="d002";
		
		Dog2 srDog= dogMap.getOrDefault(searchDogId,null);
		if(srDog!=null) {
			System.out.println("입양완료");
			srDog.adopt();
		}else {
			System.out.println("해당 강아지를 찾을 수 없습니다.");
		}
		

		
	}
	 
	 
	
}
