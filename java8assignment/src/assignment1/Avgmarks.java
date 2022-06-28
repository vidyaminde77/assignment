 
// WAP to find out average marks from the list of the marks, user will enter the marks through 
//the input box and you need to fetch them and calculate the marks
package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Avgmarks {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<=5;i++);
		{
		int c=sc.nextInt();
		list.add(c);
		
		}
	for(int d:list)
	{
		System.out.println(d);
	}
	Double avgvalue=list.stream().collect(Collectors.averagingDouble(e->e));
	System.out.println("average value is ="
			+ avgvalue);
	}
}

