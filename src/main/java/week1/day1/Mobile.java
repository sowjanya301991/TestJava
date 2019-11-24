package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile operations=new Mobile();
		{
			Boolean makeCall = operations.makeCall(987654321);
			System.out.println(makeCall);
			String sendMsg = operations.sendMsg("sowji");
			System.out.println(sendMsg);
			operations.close();
			
		}
		
		
	
	}
public Boolean makeCall(long number) {
	System.out.println();
	return true;
	
}
public String sendMsg(String name) {
	System.out.println();
	return "sowji";
	//System.out.println(return);
	
}
public void close() {
	System.out.println("has been closed");
}

}
