package unresolved.solid.l;

public class ProgMainL {

	public static void main(String[] args) {
		Rectangle shape=new Square();
		shape.setHeight(10);
		shape.setWidth(10);
		System.out.println(shape.area());
		
	}
}
