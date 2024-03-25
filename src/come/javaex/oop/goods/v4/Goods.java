package come.javaex.oop.goods.v4;

// v4. this 생성자
// 현재 자기 자신의 객체를 의미
// this() : 현재 클래스 내부의 다른 생성자를 호출할때 사용
public class Goods {
	// 필드 선언
	private String name; // 상품명
	private int price;	 // 가격
	
	//	name 필드 생성자
	public Goods(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	
	//	천체 필드 생성자
	public Goods(String name,int price) {
		
		this(name);	// > Goods(String name) 생성자 호출
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
		//	객체 초기화를 담당
//		this.name = name;
//		this.price = price;
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
