package oops_programming_style7;

public class HexagoneValidation {

	public static boolean verifyside(String unit,double side)
	{
		if(unit.equalsIgnoreCase("cm")&& side>=7&&side<=20)
		{
			return true;
		}
		else if(unit.equalsIgnoreCase("inches")&& side>=2&&side<=7)
		{
			return true;
		}
		return false;
}
}
