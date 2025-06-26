// class whiledemo
{
    public static void main(String[]args)
    {
        int a=10;
        while (a<20)
        {
            System.out.println("a=:"+ a);
            a++;


        }
    }
}


//rev_no program:
class whiledemo
{
    public static void main(String[] args) 
    {
        int num=123;
        int rev_num=0;
        while(num>0)
        {
             int digit=num%10;
             rev_num=rev_num*10+digit;
             num=num/10;

        }
        System.out.println("rev_no="+rev_num);
        
    }
}


//palindrom program
class whiledemo
{
    public static void main(String[]args)
    {
        int num=114;
        int rev_num=0;
        int temp=num;
        while(num>0)

        {
            int digit=num%10;
            rev_num=rev_num*10+digit;
            num=num/10;
            
    
        }
        if (temp==rev_num)
        {
            System.out.println(" num is palindrom :"+temp);

        }
        else
        {
            System.out.println("num is not palindrom :"+temp);

        }
        
    }
}