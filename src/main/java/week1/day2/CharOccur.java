package week1.day2;

public class CharOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am getting better with java";
		char c='t';
		int totalCount=0;
	char[] charArray = test.toCharArray();
		for(int i=0; i<charArray.length;i++)
		{
			if(charArray[i]== c)
			{
				totalCount++;
				
			}	
			}
			System.out.println("Total count of character("+c+"): " + totalCount);
		
		
		

	}

}
