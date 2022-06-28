
import java.util.function.Predicate; 
public class PredicateTest { 
  public static void main(String[] args)
{ 
 Predicate < String > notNull = ((Predicate < String > )(arg -> arg == null)).negate(); 
 System.out.println(notNull.test(null)); 
 }
}