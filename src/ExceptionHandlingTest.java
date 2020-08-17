

public class ExceptionHandlingTest 
{
	
	public static void main(String[] args) {
		System.out.println(result(10,1));
	}
	
	public static int result(int num1, int num2)
    {
        try{
           int a=num1/num2;
           System.out.println(a);
           return a;
        }
        catch(ArithmeticException e)
        {
          System.out.println("Type of exception " + e.getClass().getName());
         e.printStackTrace();
          return 10;
          //System.out
        }
        finally
        {
          //return 20;
        }
        //return 100;
    }

}
