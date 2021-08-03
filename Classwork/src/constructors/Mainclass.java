package constructors;

class Sample 
{
	public Sample() //constructor is a special type of method.
	{
		System.out.println("this is sample constructor");
	}
	public void test() //method
	{
		System.out.println("This is test() of sample class");
	}

}
public class Mainclass
{
	
	public static void main(String []args)
	{
		System.out.println("program starts.....");
		Sample s1 = new Sample();
		s1.test();
		System.out.println("program ends....");
	}
	
}
