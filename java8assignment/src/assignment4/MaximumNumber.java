//. WAP to find maximum from array of numbers with the help of stream api.


package assignment4;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String args[])
	{
		List<Integer>slist=Arrays.asList(56,100,65,678);
		Integer i=slist.stream().max(Integer::compare).get();
			System.out.println("mximum no of list is"+i);
	}
}
