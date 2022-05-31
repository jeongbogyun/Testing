package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ShapeCalcTest {
	ShapeCalc sc;
	
	@Before
	public void initialize() {
		sc = new ShapeCalc();
	}
	
	@Test
	public void circleAreaTest() {
		Circle circle = mock(Circle.class);
		when(circle.getRadius()).thenReturn(9);
		
		assertEquals(254.46, sc.areaCalc(circle), 0.01);
	}
	
	@Test
	public void circlePerimeterTest() {
		Circle circle = mock(Circle.class);
		when(circle.getRadius()).thenReturn(8);
		
		assertEquals(50.26, sc.perimeterCalc(circle), 0.01);
	}
	
	@Test
	public void rectangleTest() {
		Rectangle rect = mock(Rectangle.class);
		when(rect.getWidth()).thenReturn(2);
		when(rect.gethight()).thenReturn(5);
		
		assertEquals(10, sc.areaCalc(rect), 0.01);
	}
	
	@Test
	public void rectPerimeterTest() {
		Rectangle rect = mock(Rectangle.class);
		when(rect.getWidth()).thenReturn(8);
		when(rect.gethight()).thenReturn(5);
		
		assertEquals(26, sc.perimeterCalc(rect), 0.01);
	}
	
	@Test
	public void triangleTest() {
		Triangle tri = mock(Triangle.class);
		when(tri.getSide1()).thenReturn(6);
		when(tri.getSide2()).thenReturn(7);
		when(tri.getSide3()).thenReturn(7);
		
		assertEquals(18.97, sc.areaCalc(tri), 0.01);
	}
	
	@Test
	public void triPerimeterTest() {
		Triangle tri = mock(Triangle.class);
		when(tri.getSide1()).thenReturn(8);
		when(tri.getSide2()).thenReturn(9);
		when(tri.getSide3()).thenReturn(10);
		
		assertEquals(27, sc.perimeterCalc(tri), 0.01);
	}
}
