package oops_programming_style7;

public class ShapesValidation
{
	public static  boolean verifyColor(String color )
	{
		String allColors[]= {"RED","YELLOW","BLUE"};
		for(int i=0;i<=allColors.length-1;i++)
		{
			if(color.equalsIgnoreCase( allColors[i]))
			{
				return true;
			}
		}
		return false;
	}

	public static  boolean verifyThickness(double Thickness)
	{
		if(Thickness>=10&&Thickness<=40)
		{
			return true;
		}
		else 
			return false;
	}
	public static  boolean verifyUnit(String color )
	{
		String allColors[]= {"cm","inches"};
		for(int i=0;i<=allColors.length-1;i++)
		{
			if(color.equalsIgnoreCase( allColors[i]))
			{
				return true;
			}
		}
		return false;
	}
	 

}
