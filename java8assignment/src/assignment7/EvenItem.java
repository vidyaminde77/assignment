package assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenItem {
public static void main(String s[])
 {
List<Item> elist= new ArrayList<>();
elist.add(new Item(1,"sugar",10f));
elist.add(new Item(2,"notebook",10f));
elist.add(new Item(3,"shoes",500f));
elist.add(new Item(4,"watch",9000f));
elist.add(new Item(5,"mouse",350f));
elist.add(new Item(6,"lappy",650f));
elist.add(new Item(7,"pants",550f));
List <Float> Elist=elist.stream().filter(p -> p.itemprice%2==0).map(p->p.itemprice).collect(Collectors.toList());
System.out.println(Elist);
}
}