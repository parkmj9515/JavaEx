package come.javaex.oop.goods.v3;

// v3 생성자
public class Goods {
	// 필드 선언
	private String name; // 상품명
	private int price;	 // 가격
	
	//	생성자를 하나도 선언하지 않았을 경우
	//	자바 컴파일러가 기본 생성자를 추가한다
	//	개발자가 생성자를 만들었을경우, 기본 생성자는 추가되지 않는다
	
	//	생성자
	public Goods(String name,int price) {
		
		//	객체 초기화를 담당
		this.name = name;
		this.price = price;
	}

	// Getter , Setter
	// Setter가 없으면 Read Only 필드 만들수있고,
	// Getter / Setter 모두 없으면 프라이빗 필드 생성
	public String getName() {
//================= Instance 영역(위)===============
//================= 메서드 영역(아래)=================		
		return name;
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price <0) {
			this.price =0;
		}else {
		this.price = price;
		}
	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품이름:%s%n가격: %,d%n",
				name,price);
	}
}
