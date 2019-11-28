package optionalAssgnmnts;

public class PrimeNumExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 100;
		System.out.println("Prime numbers between 1 and " + range);
		for(int i=2;i<=range;i++)
		{
			int flag = 1;
            for(int j=2;j<=i/2;j++) 
            {
            	if(i%j==0)
            	{
            		flag = 0;
                    break;
            	}
            }
            if(flag==1)
            {
                System.out.print(i+" ");

            }
			
		}


	    }

}
