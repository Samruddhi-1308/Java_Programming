class Stringclass
{
    public static void main(String[] args) 
    {
        String s1="javame";
        System.out.println("length of string:"+s1.length());

        System.out.println("string:"+s1.charAt(2));

        String s2="javame";
        String s3="programming";

        System.out.println("comapre string:"+s1.compareTo(s2));
        
        System.out.println("compare string:"+s1.compareTo(s3));

        System.out.println("concat string:"+s1.concat(s3));

        System.out.println("equals string:"+s1.equals(s2));

        System.out.println("equals string:"+s1.equals(s3));

        System.out.println("index of string:"+s1.indexOf('v'));

        System.out.println("index of string:"+s1.indexOf('v',3));



}
}

