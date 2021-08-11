package ASSIGNMENT;

public class Reverse_array_q6 {

	public static void main(String[] args) {
		int arr[]= {3,4,7,8,2,9,10};
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr1[i]=arr[j];
			j++;
		}
		System.out.print("Reversed array: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
