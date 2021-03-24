package Assignments.Assign24032021;

public class Q5ReveseStr {
	String reverseWord="";
	
	public void reverse(String word) {
		int length=word.length();
		for(int i=length-1; i>=0; i--) {
			
			reverseWord = reverseWord + word.charAt(i);
		}
		 System.out.println(reverseWord);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5ReveseStr obj=new Q5ReveseStr();
		obj.reverse("abc");
		
	}

}
