package basics;
import java.util.*;
public class User_input 
{
     public static void Sum(int a,int b)
     {
    	 int sum;
    	 sum=a+b;
    	 System.out.println("sum of "+a+" and "+b+" is "+sum);
    	 
     }
     public static void main(String []args)
     {
    	 Scanner sc= new Scanner(System.in);
   	  System.out.println("enter a value:");		 
   	  int num1 = sc.nextInt();
   	  System.out.println("enter b value:");
   	  int num2 = sc.nextInt();
    	  Sum(num1,num2);
    	 // Sum(num1,num2);
     }
}
