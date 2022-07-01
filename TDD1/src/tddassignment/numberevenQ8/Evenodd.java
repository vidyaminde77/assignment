package tddassignment.numberevenQ8;

public class Evenodd 
{
  public static boolean main(int[] js) 
   {
	 
	  int v[]= {11,22,33,44,55,66};
	  System.out.println("Odd Numbers");
      
	  for(int i=0;i<v.length;i++)
	  {
		  if (v[i]%2!=0)
		  {
			  System.out.println(v[i]);
		  }
		  
	  }
	  
	    System.out.println("Number Is Even");
	    for(int i=0;i<v.length;i++)
	    {
	    	if (v[i]%2==0)
	    		
	    	{
	    		System.out.println(v[i]);
	    		return true;
	    	}
	    	
	    	
	    }
		return false;
		
		  
		  
 }

}	