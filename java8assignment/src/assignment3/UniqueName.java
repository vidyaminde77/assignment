package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueName {
	public static void main(String args[])
	{
		List<String> s1= new ArrayList<String>();
		
		{
			s1.add("vidya");
			s1.add("piyu");
			s1.add("vasu");
			s1.add("vidya");
			List<String> un=s1.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(un);
			
			
		}
	}

}
