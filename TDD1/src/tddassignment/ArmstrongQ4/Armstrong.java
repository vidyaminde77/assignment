package tddassignment.ArmstrongQ4;

public class Armstrong {

	public static boolean Arm(int a)
	{
		int n, temp,sum=0;
		n=a;
		while(n!=0)
		{
			temp=n%10;
			sum=sum+temp*temp*temp;
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println(a +"is armstraong number");
		return true;
		}
		else
		{
			System.out.println(a +"is not armstrong number" );
		}
		return false;
		
	}

//	public static void main(String args[])
//	{
//		Armstrong.Arm(153);
//		
//	}
}	
	