package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Automation Class $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArray = test.toCharArray();
		for(int i=0; i<charArray.length;i++)
		{
			if(Character.isLetter(charArray[i]))
			{
				letter++;	
			}
			else if(Character.isDigit(charArray[i]))
			{
				num++;
				
			}
			else if(Character.isSpaceChar(charArray[i]))
			{
				space++;
				
			}
			else 
			{
				specialChar++;
				
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
