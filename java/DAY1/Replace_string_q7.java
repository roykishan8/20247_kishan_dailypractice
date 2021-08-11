package ASSIGNMENT;

public class Replace_string_q7 {

	public static void main(String[] args) {
		
		String a=" ram is a boy";
		StringBuilder n=new StringBuilder();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' ||a.charAt(i)=='u') {
				n.append("$");
			}else {
				n.append(a.charAt(i));
			}
		}
		System.out.println("Replaced string: "+ n.toString());

	}

}
