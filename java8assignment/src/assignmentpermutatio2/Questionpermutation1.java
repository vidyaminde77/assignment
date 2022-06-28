package assignmentpermutatio2;

import java.util.Scanner;

public class Questionpermutation1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabetical ");
		String str=sc.next();
		int n = str.length();
		Questionpermutation1 permutation =new Questionpermutation1();
		Questionpermutation1.permute(str,0,n-1);
		
		
	}

	private static  void permute(String str, int s, int e) 
	{
		
		if(s==e)
			System.out.println(str);
		else 
		{
			for(int i=s;i<=e;i++)
			{
				str=swap(str, s, e);
				permute(str, s+1, e);
				str = swap(str, s, i);
				//System.out.println(str);
			}
		}
	}


	private static  String swap(String s ,int i,int j)
	{
		char temp;
		char[] charArray = s.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}

}
