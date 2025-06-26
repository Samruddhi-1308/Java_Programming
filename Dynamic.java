class Animal
{
    void sound()
    {
        System.out.println("the animals sound");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("the dog barks");
    }z

}
class Cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println(" the cat meows");
    }
} 
class Dynamic_method
{
    public static void main(String[]args)
    {
        Animal obj1=new Dog();
        obj1.sound();

        Animal obj2=new Cat();
        obj2.sound();
    }
}