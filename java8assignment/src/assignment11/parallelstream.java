//wap to perform parrallel stream api to find the no.
package assignment11;

import java.util.stream.IntStream;

public class parallelstream {

	public static void main(String[]args)
	{
		System.out.println("straight................");
		IntStream range =IntStream.rangeClosed(1, 10);
		range.forEach(System.out::println);
		System.out.println("parrallel");
		IntStream range2 = IntStream.rangeClosed(1, 10);
		range2.parallel().forEach(System.out::println);
	}
}
