
public class City_Traffic_Rules implements Country_Traffic_Rules,State_Traffic_Rules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City_Traffic_Rules a = new City_Traffic_Rules();
		a.Dontwalkinroad();
		a.Signalgreen();
		a.Signalred();
		a.Signalyellow();

	}

	@Override
	public void Dontwalkinroad() {
		// TODO Auto-generated method stub
		System.out.println("WALK");
		
	}

	@Override
	public void Signalred() {
		// TODO Auto-generated method stub
		System.out.println("STOP");
		
	}

	@Override
	public void Signalgreen() {
		// TODO Auto-generated method stub
		System.out.println("GO");
		
	}

	@Override
	public void Signalyellow() {
		// TODO Auto-generated method stub
		System.out.println("WAIT");
		
	}
	
	

}
