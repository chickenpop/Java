// package 

import java.util.ArrayList;
import java.util.Random;

public class ArrayList_T02 {

	public static void main(String[] args) {
	
    // ArrayList에 클래스 넣기
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person per1 = new Person("홍길동", "010-1234-5678", 20);
		list.add(per1);
		
		Person per2 = new Person("아무개", "010-4321-5678", 22);
		list.add(per2);
		
		Person per3 = new Person("유재석", "010-3412-7856", 28);
		list.add(per3);
		
    // ArrayList 사용
		for(Person p : list) {
			
			System.out.println(p.toString());
		
			if(p.getName().equals("유재석")) {
				System.out.println("list안에 유재석이 존재한다.");
			}
			
			String temp[] = p.getPhoneNumber().split("-");
			if(temp[2].equals("5678")) {
				System.out.println(p.getName()+"의 전화번호 끝자리는 5678이다.");
			}
					
		}
		
    // 랜덤하게 만든 이름 ArrayList에 
		Random rnd = new Random();
		ArrayList<String> lst = new ArrayList<String>();
		
		String[] name1 = { "김", "이", "박", "최", "서", "장", "고", "윤", "유"};
		String[] name2 = { "연", "은", "수", "민", "선", "길", "석", "재", "욱", "영", "현", "동" };
		
		
		for(int i=0; i<10; i++) {
		
			String name = name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)] + name2[rnd.nextInt(name2.length)];
		
			lst.add(name);
		}
		
		System.out.println(lst);
		
	}
	
}

class Person {
	private String name;
	private String phoneNumber;
	private int age;
	
	public Person(String name, String regNo, int age) {
		super();
		this.name = name;
		this.phoneNumber = regNo;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "," + "phoneNumber=" + phoneNumber + ", age=" + age
				+ "]";
	}
	
	
	
}
