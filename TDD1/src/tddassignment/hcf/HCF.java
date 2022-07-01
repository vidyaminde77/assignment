package tddassignment.hcf;

public class HCF {

	public static int Find(int a, int b) {
		int hcf = 0;
		
		for(int i =1;i<=a ||i<=b;i++)
		{
			if(a%i==0&& b%i==0)
				hcf=i;
			
		}
		return hcf;
	}
	public static void main(String[] args)
	{
		System.out.println(HCF.Find(75, 60));
		
	
	}
}
