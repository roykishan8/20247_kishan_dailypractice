package ASSIGNMENT;

public class Array_sum_q4 {

	public static void main(String[] args) {
		
		System.out.println("ARRAY SUM");
		System.out.println("Enter the size of array: ");
		int n=6;
		
		
		int sum=0;
		int arr[]= {1,2,3,4,5,6};
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Total sum : "+sum);
		
		
	}

}
