package Assignments.Assign24032021;

public class Q6Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			int j;
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			while(j<=7) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
		}

	}

}
