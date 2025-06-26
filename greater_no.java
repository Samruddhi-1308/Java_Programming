import java.util.Scanner;
public class greater_no 
{
    public static void main(String[] args) 
{
    int n1,n2;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter 1st no:");
    n1=sc.nextInt();
    System.out.println("enter 2nd no:");
    n2=sc.nextInt();

    if(n1>n2)
    {
        System.out.println("n1 is greater");
    }
    else
    {
        System.out.println("n2 is greater");
    }

    sc.close();
    
}
}

