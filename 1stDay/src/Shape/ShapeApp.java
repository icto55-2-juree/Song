package Shape;
public class ShapeApp {

	public static void main(String[] args) {
	/*	Point point1= new Point();
		point1.setX(2);
		point1.setY(5);

		Point point2= new Point();
		point2.setX(10);
		point2.setY(23);
		
		point1.show();
		point2.show();
		
		Point point3=new Point(50, 50);
		
		point3.show();
		point3.show(true);
		point3.show(false);*/
		
		ColorPoint point4 = new ColorPoint(10,50,"red");
		/*point4.setX(10);
		point4.setY(10);
		point4.setColor("red");*/
		point4.show();
		
		
		//인터페이스 테스트
	/*	 Drawable drawable = new Point(10, 20);
		 drawable.draw();*/
		 
		
		Circle c = new Circle();
		
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
	//	System.out.println(c instanceof Visible);
		
		//Rect 과 Circle 는 상속관계가 아니기 때문에 에러가 난다. 
		//System.out.println(c instanceof Rect);
		
	}

}
