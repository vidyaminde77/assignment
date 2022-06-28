package assignment8;

import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Evenodd {

	public static void main(String args[])
	{
		IntPredicate isodd = argument -> argument  % 2==1;
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		
		System.out.println( isodd.test(a));
		
		
		IntStream stream = IntStream.range(1, 10);
		List<Integer> oddNumbers = stream.filter(isodd).boxed().collect(Collectors.toList());
				System.out.println(oddNumbers);
		
				
				
				//even
				IntPredicate iseven=argument ->argument %2==0;
				System.out.println(iseven.test(a));
				
				IntStream stream1 = IntStream.range(1, 10);
				List<Integer> evenNumber = stream1.filter(iseven).boxed().collect(Collectors.toList());
				System.out.println(evenNumber);
		
	}
}
