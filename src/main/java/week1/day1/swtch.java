package week1.day1;

public class swtch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		String oper="Mul";
		
		
		switch(oper)
		{
		case "add":
			System.out.println("operation is addition"+ a+b);
			break;
			
			
		case "sub":
			System.out.println("operation is subtraction" + (a-b));
			break;
			
			
		case "Mul":
			System.out.println("operation is multiplication" + (a*b));
				break;
		default :
            System.out.println("Invalid grade");
            
		}
	    
		

	}

}
