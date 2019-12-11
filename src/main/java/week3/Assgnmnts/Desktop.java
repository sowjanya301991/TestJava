package week3.Assgnmnts;

public class Desktop implements Hardware,Software {

	
		public void desktopModel()
		{
			System.out.println("desktop model is new");
			

	}

		public void softwareResources() 
		{
			
			System.out.println("updated software resources");
		}

		
		public void hardwareResources()
		{
			System.out.println("new hardwares available");
			
		}
		public static void main(String[] args)
		{
			Desktop obj=new Desktop();
			obj.desktopModel();
			obj.softwareResources();
			obj.hardwareResources();
			
		}

		
	

}
