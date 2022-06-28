package assignment5;

public class Maxlength {

	public static void main(String[] args)throws Exception
	{

		String s="hello i am vidya";
		
		long maxCharacters = s.chars().filter(ch->ch!= ' ').count();
		System.out.println("There are max "+maxCharacters + "character is string");
		
	}

}
