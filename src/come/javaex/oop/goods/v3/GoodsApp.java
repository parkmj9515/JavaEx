package come.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
	
//	Goods camera = new Goods();
		Goods camera = new Goods("Nikon",400_000);
		
//	camera.setName ("NiKon");
//	camera.setPrice (400_000);
	
//	Goods notebook = new Goods();
//	notebook.setName ("LG그램");
//	notebook.setPrice (900_000);
		Goods notebook = new Goods("Lg그램",900_000);
	
//	Goods cup = new Goods();
//	cup.setName ("머그컵");
//	cup.setPrice (2_000);
		Goods cup = new Goods("머그컵",2_000);
	
	// 상품 정보 출력(getter 활용)
//	System.out.printf("%s, %,d원%n",
//			 camera.getName(),
//			 camera.getPrice());
//	System.out.printf("%s, %,d원%n",
//			 notebook.getName(),
//			 notebook.getPrice());
//	System.out.printf("%s, %,d원%n",
//			 cup.getName(),
//			 cup.getPrice());
	
	// 상품 정보 출력 (메서드 활용)
	camera.showInfo();
	notebook.showInfo();
	cup.showInfo();
	}
}
