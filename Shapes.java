package oops_programming_style7;

abstract public class Shapes {
	protected  String color;
	protected Outline outLine;
	protected String unit;
	
	
 
	public Shapes(String color,Outline outLine,String unit)
	{
		this.outLine=outLine;
		if(ShapesValidation.verifyColor(color))
		{
			this.color=color;
		}
		else
		{
			System.out.println("invalid color..");
		}
		 
		if(ShapesValidation.verifyUnit(unit))
		{
		this.unit=unit;	
		}
		else
		{
			System.out.println("invalid  unit..");
		}
	}
	
	public void display()
	{
		 outLine.diaplayOutline();
		System.out.println("color : "+ color);
		System.out.println("unit : "+unit);
	}
	
	abstract public void printDetails();
	
	 

}
