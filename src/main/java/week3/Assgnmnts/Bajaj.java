package week3.Assgnmnts;

public class Bajaj extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj= new Bajaj();
		obj.cost();
		obj.speed();

	}

	@Override
	public void speed()
	{
		System.out.println(" no speed limit");
		
	}

}
