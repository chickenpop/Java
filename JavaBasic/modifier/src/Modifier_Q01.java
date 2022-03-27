public class Modifier_Q01 {

	public static void main(String[] args) {

		// 1번 문제 staic
		/*

			static 변수를 이용하는 문제
			Packer라는 클래스 안에 Pencil, Eraser, BallPointPen, Ruler의 
			정보를 저장, 공통적으로 관리
			각 클래스에서는 고유 정보를 갖고 그에 따라 다른 결과를 출력

		*/

		//포장하는 직원
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
		
		
	}

}

class Packer {
	
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointCount;
	private static int rulerCount;
	
	Packer(){
		
		Packer.pencilCount = 0;
		Packer.eraserCount = 0;
		Packer.ballPointCount = 0;
		Packer.rulerCount = 0;
	
	}
	
	public void packing(Pencil pencil) {
		System.out.printf("포장 전 검수 : %s\n", pencil.info());
		Packer.pencilCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수 : %s\n", eraser.info());
		Packer.eraserCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(BallPointPen ballPointPen) {
		System.out.printf("포장 전 검수 : %s\n", ballPointPen.info());
		Packer.ballPointCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %s\n", ruler.info());
		Packer.rulerCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void countPacking(int type) {
		
		System.out.println();
		System.out.println("===============");
		System.out.println("포장 결과");
		System.out.println("===============");
		if(type == 0) {
			System.out.printf("연필 %d회\n", Packer.pencilCount);
			System.out.printf("지우개 %d회\n", Packer.eraserCount);
			System.out.printf("볼펜 %d회\n", Packer.ballPointCount);
			System.out.printf("자 %d회\n", Packer.rulerCount);
		} else if(type == 1) {
			System.out.printf("연필 %d회\n", Packer.pencilCount);
		} else if(type == 2){
			System.out.printf("지우개 %d회\n", Packer.eraserCount);
		} else if(type == 3) {
			System.out.printf("볼펜 %d회\n", Packer.ballPointCount);
		} else if(type == 4) {
			System.out.printf("자 %d회\n", Packer.rulerCount);
		} 
	}
	
}

class Pencil {
	private String hardness;
	private String[] hardnessType = { "4B", "3B", "2B", "B", "HB", "H", "2H", "3H", "4H"};
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		if(checkHardness(hardness)) {
			this.hardness = hardness;			
		} 
		return;
	}
	
	private boolean checkHardness(String hardness) {
		for(int i=0; i<hardnessType.length;i++) {
			if(hardnessType[i].equals(hardness)) {
				return true;
			}
		}
		return false;
	}

	public String info() {
		
		return String.format("%s 진하기 연필입니다.", this.hardness);
	}
	
	
}

class Eraser {
	private String size;
	private String[] sizeType = {"Large", "Medium", "Small"};
	
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		if(checkSize(size))
			this.size = size;
		return;
	}

	private boolean checkSize(String size) {
		for(int i=0; i<sizeType.length; i++) {
			if(sizeType[i].equals(size)) {
				return true;
			}
		}
		return false;
	}

	public String info() {
		return String.format("%s 사이즈 지우개입니다.", this.size);
	}
}

class BallPointPen {
	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String info() {
		return String.format("%s 색상 %.1fmm 볼펜입니다.", this.color, this.thickness);
	}
	
}

class Ruler {
	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String info() {
		return String.format("%dcm %s 줄자입니다.", length, shape);
	}

}




