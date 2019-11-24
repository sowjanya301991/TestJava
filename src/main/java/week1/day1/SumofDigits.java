package week1.day1;

public class SumofDigits {

	 public static void main(String[] args) {
		 int num =123;
	        int sum = 0;
	        while (num > 0) {
	            sum = sum + num % 10;
	            System.out.println("sum of numbers"+ sum);
	            num = num / 10;
	            System.out.println("value is"+ num);
	        }
	        System.out.println(sum);
	       
	        
	}
	 }
	     