interface Exam
{
    int sports_mark=20;

}
class Student
{
    String sname;
    int Roll_no;
    int m1;
    int m2;
    int m3;

    Student(String n,int a,int b,int c,int d)
    {
        sname=n;
        Roll_no=a;
        m1=b;
        m2=c;
        m3=d;
    }
    void showdata()
    {
        System.out.println("std name:"+sname);
        System.out.println("roll no:"+Roll_no);
        System.out.println("subject 1:"+m1);
        System.out.println("subject 2:"+m2);
        System.out.println("subject 3:"+m3);

    }
}
class Result extends Student implements Exam
{
    Result (String n,int a,int b,int c,int d)
    {
        super(n,a,b,c,d);
    }
    void display()
    {
        super.showdata();
        int total=(m1+m2+m3);
        float result=(total+sports_mark)/total*100;
        System.out.println("result of student:"+result);
    }
}

class Demo_details
{
    public static void main(String[] args) 
    {
        Result r=new Result("siya",12,50,60,70);
        r.display();
    }
}

