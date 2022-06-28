// WAP to print distinct marks from the list of given marks 


package assignment2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMarks {

	public static void main(String args[])
	{
		List<Integer>slist=Arrays.asList(34,98,65,54);
		List<Integer>marks=slist.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(marks);
	}
}
