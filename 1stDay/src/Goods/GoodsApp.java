package Goods;

public class GoodsApp {
public static void main(String[] args) {
	Goods g = new Goods();
	
	g.setName("Nickon");
	g.setPrice(400000);
	g.setCountStock(30);
	g.setCountSold(100);
	
	Goods g2 = new Goods("Nickon2", 200, 300, 100000);

	
	System.out.println("실행결과===================");
	System.out.println("상품이름:"+g.getName());
	System.out.println("상품가격:"+g.getPrice());
	System.out.println("재고수량:"+g.getCountStock());
	System.out.println("팔린수량:"+g.getCountSold());

	System.out.println("실행결과====================");
	System.out.println("상품이름:"+g2.getName());
	System.out.println("상품가격:"+g2.getPrice());
	System.out.println("재고수량:"+g2.getCountStock());
	System.out.println("팔린수량:"+g2.getCountSold());
}
}
