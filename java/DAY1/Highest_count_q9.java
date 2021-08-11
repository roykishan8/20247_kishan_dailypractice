package ASSIGNMENT;

public class Highest_count_q9 {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3,3, 4, 2, 7, 8, 8, 3,3};   
        
       int count=0; 
       int max=0;
        for(int i = 0; i < arr.length; i++) {  
        	count=1;
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                   
                	count++;
            }
            if(max<count) {
            	max=count;
            }
        }
        System.out.println(max);

	}

}
