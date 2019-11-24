package week1.day1;

public class Fibnci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum=10;
		int previousNum=0;
		int nextNum=1;
		//System.out.println("fibonaci series of num" +);
		int i=1;
		
		System.out.println("maximum num" + maxNum);
		while(i<=maxNum)
		{
			int sum=previousNum+nextNum;
			nextNum=sum;
			i++;
			
		}

	}

}
