
public class reversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String act = "madam";
		String rev= "" ;
		for(int i=act.length()-1;i>=0; i-- ) {
			char c= act.charAt(i);
			rev = rev + c;
		}
		System.out.println("Reverse string is : "+ rev);
		
	}

}
