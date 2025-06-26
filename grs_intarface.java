interface salary
{
    double Basic_salary=10000.0;
    void Basic_sal();
}

class Employee
{
    String name;
    int age;
    Employee(String n, int a)
    {
        name=n;
        age=a;

    }
    void Display()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);

    }

}

class Gross_salary extends Employee implements salary
{
    double TA,DA,HRA;
    Gross_salary(String n,int a,double t,double d,double h)
    {
        super(n,a);
        TA=t;
        DA=d;
        HRA=h;
        
    }
    public void Basic_sal()
    {
        System.out.println("basic salary:"+Basic_salary);
    }

    void Total_sal()
    {
        Display();
        Basic_sal();
        double Total_sal=Basic_salary+TA+DA+HRA;

        System.out.println("total_salary:"+Total_sal);
    }

}

class Emp
{
    public static void main(String[] args) 
    {
       Gross_salary s= new Gross_salary("john",23,1000,2000,7000); 
       s.Total_sal();
    }
}