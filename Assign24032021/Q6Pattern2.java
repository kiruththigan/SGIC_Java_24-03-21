package Assignments.Assign24032021;

public class Q6Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i=i+2) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k=3;k>=1;k=k-2) {
			for(int l=1;l<=k;l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
