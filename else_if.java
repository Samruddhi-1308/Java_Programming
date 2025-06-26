// // using number
class else_if
{
    public static void main(String[] args) 
    {
        int a=15,b=25,c=30;
        if(a>b && a>c)
        {
            System.out.println("a is greter");
        }
        else if(b>a && b>c )
        {
            System.out.println("b is greter");
        }
        else if(c>a && c>a)
        {
            System.out.println("c is greter");
        }
        
        
    }
}


//using mark
class else_ifdemo
{
    public static void main(String[] args) 
    {
        int mark=50;
        if(mark<=60 & mark>=55)
        {
            System.out.println("A grade");
        }
        else if(mark<=55 & mark>=50)
        {
            System.out.println("B grade");
        }
        else if(mark<=50 & mark>=45)
        {
            System.out.println("c grade");
        }
        else
        {
            System.out.println("fail");
        }

    }
}