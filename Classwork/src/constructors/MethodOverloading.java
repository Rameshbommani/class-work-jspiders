package constructors;
class graphsheet
{

	public void drawpoints()
	{
		System.out.println("drawpoints at 0,0");
	}
	public void drawpoints(int x, int y)
	{
		System.out.println("drawpoints at "+x+","+y);
	}
	public void drawpoints(int x, double y)
	{
		System.out.println("drawpoints at "+x+","+y);
	}
	public void drawpoints(double x, int y)
	{
		System.out.println("drawpoints at "+x+","+y);
	}
	public void drawpoints(double x, double y)
	{
		System.out.println("drawpoints at "+x+","+y);
	}
}


public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		graphsheet g1= new graphsheet();
		g1.drawpoints();
		g1.drawpoints(2,3);
		g1.drawpoints(2,5);
		g1.drawpoints(3,4.5);
		g1.drawpoints(5.6,8);
		g1.drawpoints(9.0,10.0);

	}

}
