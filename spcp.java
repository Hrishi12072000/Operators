import java.util.Scanner;

public class spcp
{
     public static void main(String args[])
    {
      int num1,num2,SP,CP,res,res1;
      
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("Enter selling price of product:-");
      num1=scanner.nextInt();
      System.out.println("Enter cost price of product:-");
      num2=scanner.nextInt();

      SP=num1;
      CP=num2;
      res=num1-num2;
      res1=num2-num1;

      System.out.println("profit on product="+ res);
      System.out.println("loss on product="+ res1);
     
      
     }
}