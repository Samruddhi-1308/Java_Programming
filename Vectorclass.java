import java.util.*;
public class Vectorclass
{
public static void main(String[]args)
{
	Vector<Integer> list=new Vector<>();
	
	list.addElement(4);
	list.addElement(5);
	list.addElement(6);
	list.addElement(7);
	list.addElement(8);
	
	System.out.println("initial vector:"+list);

	list.removeElement(4);
	System.out.println("remove element:"+list);
	
	list.remove(2);
	System.out.println("remove element:"+list);
	
	System.out.println("size of vector:"+list.size());

	int b=list.firstElement();
    System.out.println("vector :"+b);


	
	list.add(2,100);
	System.out.println(list);

	list.removeAllElements();
	System.out.println("remove all elements:"+list);


	
}
}
	
	
	