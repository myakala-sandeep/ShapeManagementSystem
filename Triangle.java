package oops_programming_style7;

public class Triangle extends Shapes
{
	   private double base;
	   private double height;
	   private double area;
 
	public Triangle(String color,Outline outLine,String unit,double base,double height)
	{
		super(color,outLine,unit);
		if(TriangleValidation.verifyBase(unit, base))
		{
			this.base=base;
		}
		else
		{
			System.out.println("invalid base");
		}
		if(TriangleValidation.verifyHeight(unit, height))
		{
			this.height=height;
		}
		else
		{
			System.out.println("invalid height");
		}
		if(TriangleValidation.verifyHeight(unit, height)&&(TriangleValidation.verifyBase(unit, base)))
	    {
			this.area=0.5*(height*base);
	    }
	}
	
	public void printDetails()
	{
		display();
		System.out.println("base : "+this.base+" "+unit);
		System.out.println("height : "+this.height+" "+unit);
		System.err.println("area : "+area);
	}
 

}
