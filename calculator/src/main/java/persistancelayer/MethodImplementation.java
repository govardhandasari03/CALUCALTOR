package persistancelayer;

public class MethodImplementation {
	public float addition(int firstnumber,int secondnumber)
	{
		return firstnumber + secondnumber;
	}
	public float subtraction(int firstnumber,int secondnumber)
	{
		return firstnumber - secondnumber;
	}
	public float multipliaction(int firstnumber,int secondnumber)
	{
		if(firstnumber !=0 & secondnumber!=0)
		{
		return firstnumber * secondnumber;
		}
		else
		{
			return 0;
		}
	}
	public float division(int firstnumber,int secondnumber)
	{
		if(secondnumber  !=0)
		{
		return firstnumber / secondnumber;
		}
		else
		{
			return 0;
		}
	}

}
