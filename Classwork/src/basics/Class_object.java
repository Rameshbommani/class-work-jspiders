package basics;

class demo
{
	static int a = 10;
	int num=90;
	public  void test()
	{
		System.out.println("this is the test method ");
	}
}

public class Class_object 
{
	public static void main(String[] args)
	{
		demo d= new demo();
		d.test();
		System.out.println(d.num);
		System.out.println(demo.a);
		
		//we can also assign reference variable to another variable
		
		demo a=d;
		a.test();
		// another way to create object
		System.out.println(new demo().num);

	}

}
