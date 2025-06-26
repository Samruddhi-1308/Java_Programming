class nest_if
{
    public static void main(String[]args)
    {
        int a=10,b=20,c=30;
        if(a<b)
        {
            if(a<c)
            {
            System.out.println("a is less");
            }
        }
        if(b<a)
        {
            if(b<c)
            {
                System.out.println("b is less");
            }
        
        }

        if(c<a)
        {
            if(c<b)
            {
                System.out.println("c is less");
            }
        }
    }
}