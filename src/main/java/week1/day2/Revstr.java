package week1.day2;

public class Revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "feeling good";

		String rev="";
		for(int i=test.length()-1;i>=0;i--)
		{
			rev=rev+test.charAt(i);
		}
		System.out.println("reverse of string" +rev);
		
	}

}
