package Assignments.Assign24032021;

public class Q4ArmStrong {
	int sum,mod,temp;
	boolean armStrong(int a) {
		temp=a;
		while(a>0) {
			mod=a%10;
			sum=sum+(mod*mod*mod);
			a=a/10;
		}
		return sum==temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q4ArmStrong obj=new Q4ArmStrong();
		
		System.out.println(obj.armStrong(151));
	}

}
