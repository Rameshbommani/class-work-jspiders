package basics;

public class LocalGlobal 
{
    static int a = 10;// static global variable
           int num=90;//non-static global variable
    public static void test(int x,int y)
    {
    	int sum; //Local variables
    	sum = x+y;
    	System.out.println(sum);
    }
	public static void main(String[] args) 
	{
		test(4,5);
		
		System.out.println(a);
		LocalGlobal lg= new LocalGlobal();
		System.out.println(lg.num);

	}
	

}
