package oops_programming_style7;

public class TriangleValidation
{
	public static boolean verifyBase(String unit,double base)
	{
		if(unit.equalsIgnoreCase("cm")&& base>=15&&base<=30)
		{
			return true;
		}
		else if(unit.equalsIgnoreCase("inches")&& base>=5&&base<=12)
		{
			return true;
		}
		return false;
		
	}
	public static boolean verifyHeight(String unit,double height)
	{
		if(unit.equalsIgnoreCase("cm")&& height>=18&&height<=40)
		{
			return true;
		}
		else if(unit.equalsIgnoreCase("inches")&& height>=7&&height<=15)
		{
			return true;
		}
		return false;
		
	}

}
