package ASSIGNMENT;

public class Large_number_q10 {

	public static void main(String[] args) {
		 int arr[]= {3,8,45,26,7,9};
		 int max1=arr[0];
		 int max2=max1;
		 for(int i=0;i<arr.length;i++) {
			 if (max2<arr[i]) {
				 max1=max2;
				 max2=arr[i];
			 }else if(max1<arr[i]) {
				 max1=arr[i];
			 }
		 }
		 System.out.println(max1+" "+max2);

	}

}
