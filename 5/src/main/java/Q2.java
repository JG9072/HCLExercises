import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		

		//Variables:
		String str;
		
		//Scan string
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		
		isPalindrome(str);

		
		
	}// end of main


	public static void isPalindrome(String str){
		//Make some StringBuilders
        String originalStr = str;
        StringBuilder reversedStr = new StringBuilder(str);
     
        //Reverse the StringBuilder1
        reversedStr.reverse(); 
        String newString = reversedStr.toString();
        
        //Test for first char and last char
        if( originalStr.equals(newString) ) {
        	System.out.println("Palindrome");
        }
        else{
        	System.out.println("Not Palindrome");
        }
		
				
	}//end of checkCharacters
	
	

}//end of UserMainCode Class
