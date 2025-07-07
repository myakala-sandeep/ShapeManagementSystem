package oops_programming_style7;
import java.util.*;
public class OutlineValidation 
{
 
	public static boolean verifyThichness(double thickness) {
		 
		if(thickness>=0.25&&thickness<=6)
			{
				return true;
			}
		return false;
	}
	
	public static boolean verifyColor(String color)
	{
		 ArrayList<String> allColor = new ArrayList<>();
		 allColor.addAll( Arrays.asList( "light red","red","light green","green","lighrblue","blur","dark blue","purpule"));
		 if(allColor.contains(color))
		 {
			return true; 
		 }
		return false;
	}
	
	public static boolean verifyStyle(String style)
	{
		if(style.equalsIgnoreCase( "solid")||style.equalsIgnoreCase( "dotted"))
		{
			return true;
		}
		return false;
	}

 

 

}
