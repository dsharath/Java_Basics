import java.util.Scanner;

public class ReversingString {


	
	
	
	public static void main(String[] args) {

		
		
		System.out.println("  Enter the string want to be reversed..");
		
		Scanner read= new Scanner(System.in);
		
		String str = read.nextLine();
		String strreverse = "";
		System.out.println("Entered string :: "+str);
		
		for(int i= str.length()-1; i>=0;i--) {
			
			strreverse = strreverse + str.charAt(i);
		}
		
		System.out.println("Reversed string :: "+strreverse);
		
		
		
	}

}
