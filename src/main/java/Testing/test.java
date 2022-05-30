package Testing;

public class test {
	MockitoTest mt;
	
	public void setMT(MockitoTest mt) {
		this.mt = mt;
	}
	
	int testMethod(int a) {
		int b = mt.mockito(a);
		b = b + 30;
		return b;
	}
}

