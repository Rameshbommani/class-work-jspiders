package class_and_objects;

class Sample1
{
	int i1=301;
	
	public void display()
	{
		System.out.println("this is display() in sample");
	}
}

class Demo1
{
	public Sample1 getSampleobj()
	{
		Sample1 s1 = new Sample1();
		return s1;
	}
}
public class Mainclass {

	public static void main(String[] args) 
	{
		Demo1 d1= new Demo1();
		Sample1 sm1 = d1.getSampleobj();
		sm1.display();

	}

}
