package weekdays.assnmnts;

public class RemoveDuplctWrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learnt java basics as part of java sessions in week1";
		  
		  String words[] = text.split(" ");  
	           

	       
		for(int i=0;i<words.length;i++)
		{
			if(words[i]!=null)
			{
				
		for(int j=i+1; j<words.length;j++ )
		{
			 if(words[i].equals(words[j]))
			 {
				 
				 
				words[j]=null;
				System.out.println(words[i]); 
			 }
		}
		
			}
		
		}
		for(int k=0;k<words.length;k++)		//Displaying the String without duplicate words	more
		{
			if(words[k]!=null)
			{
				System.out.println(words[k]);
			}
			
	     }  
	}

}

