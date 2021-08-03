package constructors;
class Demo
{
	public Demo() //default constructor
	{
		System.out.println("this is sample() constructor");
	}
	public Demo(int n)   //parameterized constructor 
	{
		System.out.println("this is sample(int n) constructor");
	}
	public Demo(double n1)
	{
		System.out.println("this is sample(double n1) constructor");
	}
	public Demo(int n1,double n2)
	{
		System.out.println("this is sample(int n1,double n2) constructor");
	}
	public Demo(double n1,int n2)
	{
		System.out.println("this is sample(double n1,int n2) constructor");
	}
	public Demo(int n1,int n2)
	{
		System.out.println("this is Demo(int n1,int n2) constructor");
	}
	
}
public class ConstructorOverloading {

	public static void main(String[] args) 
	{
       new Demo();
       new Demo(10);
       new Demo(5.5);
       new Demo(10,4.5);
       new Demo(5.5,6);
       new Demo(4,4);

	}

}
