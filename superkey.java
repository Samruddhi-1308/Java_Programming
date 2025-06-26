public class superkey 
{

    int i;
}

class B extends superkey
{
    int i;
    B(int a,int b)
    {
        super.i=a;
        i=b;
    }
    void disp()
    {
        System.out.println("i in super class:"+i);
        System.out.println("i in subcclass:"+i);
    }

    public static void main(String[] args) 
    {
        

        B b1=new B(10,20);
        b1.disp();
    }
}

