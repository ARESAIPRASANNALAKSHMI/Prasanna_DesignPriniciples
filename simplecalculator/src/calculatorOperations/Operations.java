package calculatorOperations;

public class Operations {
	public int add(int num1,int num2)
	{
		return (num1+num2);
	}
	public int sub(int num1,int num2)
	{
		return (num1-num2);
	}
	public int mul(int num1,int num2)
	{
		return (num1*num2);
	}
	public float div(int num1,int num2)
	{
		float result=0;
		try
		{
			result=num1/num2;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division By Zero is not possible");
		}
		return result;
	}

}
