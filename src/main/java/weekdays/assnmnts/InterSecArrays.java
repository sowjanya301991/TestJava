package weekdays.assnmnts;

public class InterSecArrays {

	public static void main(String[] args) {
		// TODO Auto-generated 
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		System.out.println("Intersection of the two arrays ::");
		for(int i = 0; i<arr1.length; i++ ) {
	         for(int j = 0; j<arr2.length; j++) {
	        	 if(arr1[i]==arr2[j]) {
	                 System.out.println(arr2[j]);
	        	 
	         }
	         }
	}

}
}
