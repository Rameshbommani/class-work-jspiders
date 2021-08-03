package inheritance;

class Alpha
{
	int a=10;
	public void display()
	{
		System.out.println("this is display() in Alpha class");	
	}
}

class Beta extends Alpha
{
	static double b= 10.2;
	protected static void view()
	{
		System.out.println("this is view() in Beta class");
	}
}

class Gama extends Beta
{
	 double sum;
	 public double sum()
	 {
		 return a+b;
	 }
}

public class Mainclass2 
{
  public static void main(String []args)
  {
	  Gama g1 = new Gama();
	  System.out.println(g1.sum());
	  g1.display();
	  g1.view();
	  
  }
}
