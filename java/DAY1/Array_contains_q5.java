package ASSIGNMENT;

public class Array_contains_q5 {

	public static void main(String[] args) {
		
		int arr[]= {3,4,7,8,2,9,10};
		int num=2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("Number "+ num+" is found in array");
				break;
			}
		}
		

	}

}
