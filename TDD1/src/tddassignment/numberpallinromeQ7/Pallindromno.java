package tddassignment.numberpallinromeQ7;

public class Pallindromno {

	public static boolean pal(int n) {
		
	 int r,sum=0,temp;    
	   //It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    {
	   System.out.println("palindrome number "+temp); 
	   return true;
	  }
	  else {   
	   System.out.println("not palindrome");
	return false;    
	  }
}
	public static void main(String[] args) {
	
		Pallindromno.pal(1001);
	}
}