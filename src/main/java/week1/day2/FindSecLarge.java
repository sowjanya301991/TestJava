package week1.day2;

import java.util.Arrays;

public class FindSecLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("second large number is " + data[data.length-2]);
		

	}

}
