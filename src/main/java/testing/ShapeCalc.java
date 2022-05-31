package testing;

public class ShapeCalc {

	public double areaCalc(Circle circle) {
		return circle.getRadius() * circle.getRadius() * Math.PI;
	}
	
	public double perimeterCalc(Circle circle) {
		return 2 * Math.PI * circle.getRadius();
	}
	
	public double areaCalc(Rectangle rect) {
		return rect.getWidth() * rect.gethight();
	}
	
	public double perimeterCalc(Rectangle rect) {
		return 2 * (rect.getWidth() + rect.gethight());
	}
	
	public double areaCalc(Triangle tri) {
		double p = perimeterCalc(tri)/2;  
        return Math.sqrt(p * (p - tri.getSide1()) * (p - tri.getSide2()) * (p - tri.getSide3()));
	}
	
	public double perimeterCalc(Triangle tri) {
		return tri.getSide1() + tri.getSide2() + tri.getSide3();
	}
	
	
}
