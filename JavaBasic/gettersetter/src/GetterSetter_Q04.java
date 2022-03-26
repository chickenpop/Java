public class GetterSetter_Q04 {

	public static void main(String[] args) {

		// 4번 문제 Employee
		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("대리");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //직속 상사 없음

		e1.info();


		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); //직속 상사 e1(홍길동)

		e2.info();
		
	}

}

class Employee {
	
	private String name;
	private String department;
    private String position;
    private String tel;
    private Employee boss;
    
    // 부서와 직책
    private String[] departmentList = { "영업부", "기획부", "총무부", "개발부", "홍보부" };
    private String[] positionList = { "부장", "과장", "대리", "사원" };
    
    //getter, setter 구현
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	if(checkName(name)) {
    		this.name = name;
    	} else {
    		System.out.println("이름 입력 오류");
    	}
    }
    
    public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if(checkDepartment(department)) {
			this.department = department;
		} else {
			System.out.println("부서 입력 오류");
		}
	}


	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		if(checkPosition(position)) {
			this.position = position;
		} else {
			System.out.println("직책 입력 오류");
		}
	}


	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if(checkTel(tel)) {
			this.tel = tel;
		} else {
			System.out.println("전화번호 입력 오류");
		}
	}


	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		
		if(boss == null) return;
			
		if(this.department.equals(boss.department)) {
			this.boss = boss;
		}else {
			System.out.println("직속 상사의 부서가 일치하지 않습니다.");
		}
		
	}

	// 기능 구현
    private boolean checkName(String name) {
    	
    	if(name.length() < 2 || name.length() > 5) return false;
    	
    	for(int i=0; i<name.length(); i++) {
    		char c = name.charAt(i);
    		if( c < '가' || c > '힣') {
    			return false;
    		}
    	}
    	return true;
    }
    
    private boolean checkDepartment(String department) {
    	for(int i=0; i<departmentList.length; i++) {
    		if(departmentList[i].equals(department)) {
    			return true;
    		}
    	}
    	return false;
    }

    private boolean checkPosition(String position) {
    	for(int i=0; i<positionList.length; i++) {
    		if(positionList[i].equals(position)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    private boolean checkTel(String tel) {
    	
    	if(tel.substring(0, tel.indexOf("-")).length() != 3) {
    		return false;
    	}    		
    	
    	if(tel.substring(tel.indexOf("-")+1, tel.lastIndexOf("-")).length() != 4) {
    		return false;
    	}
    	
    	if(tel.substring(tel.lastIndexOf("-")+1).length() != 4) {
    		return false;
    	}    	
    	return true;
    }
    
	public void info() {
    
//		[홍길동]
//		- 부서: 홍보부
//		- 직위: 부장
//		- 연락처: 010-1234-5678
//		- 직속상사: 없음
		System.out.printf("[%s]\n", this.name);
		System.out.printf("- 부서: %s\n", this.department);
		System.out.printf("- 연락처: %s\n", this.tel);
		if(this.boss == null) {
			System.out.println("- 직속 상사: 없음\n");
		} else {
			System.out.printf("- 직속 상사: %s (%s %s)", 
								this.boss.name, 
								this.boss.department,
								this.boss.position);
		}
		
    }
	
	
}








