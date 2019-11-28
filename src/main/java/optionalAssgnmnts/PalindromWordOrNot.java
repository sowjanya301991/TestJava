package optionalAssgnmnts;

public class PalindromWordOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "madam";
		String rev = "";
		for(int i=text.length()-1; i >=0; i--)
		{
		     rev= rev + text.charAt(i);
		}
		System.out.println("original word " + text );
		System.out.println("Reversed word " + rev );
		if(text.equals(rev)){
		    System.out.println("The word is Palindrome");
		} else{
		    System.out.println("The word is not Palindrome");
		}


	}

}
