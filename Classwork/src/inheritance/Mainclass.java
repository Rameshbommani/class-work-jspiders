package inheritance;

// super-class, ParentClass, BaseClass
class Sample
{
	final protected int v1=91;//final data member
	 static long v2=99999999999l;
	
	public static void display()
	{
		System.out.println("this is display() of sample class");
	}
	
	final public  void view() //final function_member/method
	{
		System.out.println("this is view() of sample class");
	}
}

// sub-class, child-class, DerivedClass
class Demo extends Sample  
{
	double z1=78.8;
	public void test()
	{
		System.out.println("this is test() of demo class");
	}
}

public class Mainclass 
{

	public static void main(String[] args) 
	{
		Demo d1 =new Demo(); //creating the object of child class
		d1.test();
		d1.view();
		System.out.println(d1.v1);
		System.out.println(d1.v2);
		
		Sample s1=new Sample(); //creating the object of super class
		s1.view();
		
		Sample.display();

	}

}
