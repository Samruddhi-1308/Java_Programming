
import java.util.Scanner;
public class switchstring
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);      // scanner object to user input
      System.out.println("enter a color:");      //enter color
      
      String color = sc.next();      //user input stored in color variable
      StringBuffer sb = new StringBuffer();   //object
      switch (color)
       {
        case "red":
        sb.append("chose red");
        break;

        case "green":
        sb.append("chose green");
        break;

        case"blue":
        sb.append("chose blue");
        break;
        
        default:
        sb.append("invalid color");
        }
      System.out.println(sb.toString());
      sc.close();        //close the scanner class
      }
}




