public class Constructor_overload_Q01 {

	public static void main(String[] args) {

		// 1번 생성자 오버로딩
		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
		
		
	}

}

class Student {
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		
		this("미정", 0, 0, 0, 0);
		
	}
	
	public Student(String name, int age, int grade, int classNumber, int number) {

		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
		
	}
	
	public Student(String name, int age) {
		this(name, age, 0, 0, 0);
	}

	public Student(int grade, int classNumber, int number) {
		this("미정", 0, grade, classNumber, number);
	}
	public String info() {

		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append("(");
		
		if(this.age == 0) {
			sb.append("나이 : 미정, ");
		} else {
			sb.append("나이 : ");
			sb.append(this.age);
			sb.append("세, ");
		}
		
		if(this.grade == 0) {
			sb.append("학년 : 미정, ");
		} else {
			sb.append("학년 : ");
			sb.append(this.grade);
			sb.append(", ");
		}
		
		if(this.classNumber == 0) {
			sb.append("반 : 미정, ");
		} else {
			sb.append("반 : ");
			sb.append(this.classNumber);
			sb.append(", ");
		}
		
		if(this.number == 0) {
			sb.append("번호 : 미정");
		} else {
			sb.append("번호 : ");
			sb.append(this.number);
		}
		
		sb.append(")\n");
		return sb.toString();
	}
}








