package tddassignment.VowelQ6;
import java.io.*;

public class Vowel {
   public static int vowel(String str){
      
       str = str.toLowerCase();
       int count = 0;

       for (int i = 0; i < str.length(); i++) {
           // check if char[i] is vowel
           if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
               || str.charAt(i) == 'i'
               || str.charAt(i) == 'o'
               || str.charAt(i) == 'u') {
               
               count++;
           }
       }

       // display total count of vowels in string
       System.out.println(
           "Total no of vowels in string are: " + count);
	return count;
	
   }
   public static void main(String[] args){
	Vowel.vowel("vidyaminde");
}
}

