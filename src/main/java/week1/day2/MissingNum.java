package week1.day2;

import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,4,6,7,8};
		Arrays.sort(data);
		
		for( int i =0;  i<data.length-1;i++)
		{
		
	      if (data[i+1]!=data[i]+1)
	      {
	    	 int k=data[i]+1;
	    	  
	    	  System.out.println("missing number is" +" "+ k);
	      }

	}

	}
	
}
