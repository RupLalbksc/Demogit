
public class ATraffic implements CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CT c = new ATraffic();
		c.greengo();
		c.redstop();
		c.yellowwait();

	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green");
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("Red");
		
	}

	@Override
	public void yellowwait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow");
		
	}

}


