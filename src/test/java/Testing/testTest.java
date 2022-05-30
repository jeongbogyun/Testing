package Testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class testTest {

	@Test
	public void test() {
		MockitoTest mt = mock(MockitoTest.class);
		when(mt.mockito(1)).thenReturn(1);
		
		test t = new test();
		t.setMT(mt);
		
		assertEquals(31, t.testMethod(1));
	}

}
