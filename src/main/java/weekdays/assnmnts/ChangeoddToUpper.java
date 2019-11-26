package weekdays.assnmnts;

public class ChangeoddToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		String res ="";
		
		//Build a logic  to change the odd index to uppercase (output:cHaNgEmE)
				/* Pseudo Code: 
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) find the odd index within the loop (use mod operator)
				d) within the loop, change the character to uppercase if the index is odd else don't change
				   (use Character.toUpperCase(ch) and print without new line as System.out.print(ch);
	*/
		char[] charArray = test.toCharArray();
		
		for(int i=0;i<test.length(); i++)
		{
			char ch= charArray[i];
			if (i % 2 != 0)
			{
				res += Character.toUpperCase(test.toCharArray()[i]);
				
			}
			else
			{
				
				res += Character.toLowerCase(test.toCharArray()[i]);
			}
	}

        System.out.println("Newly generated string is as follow: "+ res);
}
}


		
	 	