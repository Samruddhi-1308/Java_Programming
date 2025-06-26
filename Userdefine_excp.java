import java.util.*;
class Trycatch_excp
{
   public static void main(String[]args)
	{  
	  int a=10,b=0;
	  int x=a/b;
	  
	  System.out.println("Result:"+x);
	}
	catch(ArithmeticException e);
	{
	  System.out.println("exception:"+e.getMessage());
	}

	
        
        }
}

