package weekdays.assnmnts;

import java.util.Scanner;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		String test="I am a software tester";
		String res ;
		String rev="";
		StringBuilder sb=new StringBuilder();
				
		String []words=test.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(i%2 == 0) 
                sb.append(words[i]); 
            else sb.append(new StringBuilder(words[i]).reverse()); 
            sb.append(" ");
		}
		System.out.println(sb);
	}

	}



