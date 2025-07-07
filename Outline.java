package oops_programming_style7;

public class Outline 
{
	private  double thickness;
	private String color;
	private String style;
	
	public Outline(double thickness,String color,String style)
	{
		if(OutlineValidation.verifyThichness(thickness))
		{
			this.thickness=thickness;
		}
		else
		{
			System.err.println("invalis thickness");
		}
		
		if(OutlineValidation.verifyColor(color))
		{
			this.color=color;
		}
		else
		{
			System.err.println("invalis color");
		}
		
		if(OutlineValidation.verifyStyle(style))
		{
			this.style=style;
		}
		else
		{
			System.err.println("invalis style");
		}
	}
	
	public void diaplayOutline()
	{
	    System.out.println("outline thickness : "+thickness);
		System.out.println( "outline color : "+color);
		System.out.println("outline style : "+style);
	}
	

}
