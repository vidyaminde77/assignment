package assignQ10;

public class concat {
	public static String con(String a[])
	{
		
		
		String v="";
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
				v+=a[i];
			else
				v+=a[i]+"-";
			System.out.println("apple-orange-banana-lemon");
		}
		return v;

		
	}

}
