class Sb
{
    public void display1()
    {
        System.out.println("method of class a");
    }

    final public void show(int a)
    {
        System.out.println("a:"+a);

    }
    
}
class B extends Sb
{
    //@Override
    public void display1()
    {
        System.out.println("method of class b");
    }
    public void method_calling()
    {
        display1();
        super.display1();
    }

}
class test2
{
    public static void main(String[]args)
    {
        B b1 = new B();
        b1.method_calling();
        b1.show(10);

    }
}
