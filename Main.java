package program5;
class Shape {
	public void draw() {
		System.out.println("Drawing a shape");
	}
	public void erase() {
		System.out.println("Erasing a shape");

	}
}
class circle extends Shape{
	public void draw() {
		System.out.println("Drawing a circle");
	}
	public void erase() {
		System.out.println("Erasing a circle");
	}
}
class triangle extends Shape{
	public void draw() {
		System.out.println("Drawing a triangle");
	}
	public void erase() {
		System.out.println("Erasing a triangle");
	}
}
class square extends Shape{
	public void draw() {
		System.out.println("Drawing a square");
	}
	public void erase() {
		System.out.println("Erasing a square");
	}
}

public class Main {
	public static void main(String[] args) {
		Shape circle=new circle();
		Shape triangle=new triangle();
		Shape square=new square();
		
		displayShapeDetails(circle);
		displayShapeDetails(triangle);
		displayShapeDetails(square);
	}
	public static void displayShapeDetails(Shape shape) {
		shape.draw();
		shape.erase();
		System.out.println();
	}
}
