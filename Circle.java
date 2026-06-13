package test06;

public class Circle extends Shape{

	@Override
	public void calculateArea() {
		double area =Math.PI*5*5;
		System.out.println(area);
	}

}
