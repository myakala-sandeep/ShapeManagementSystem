package oops_programming_style7;

public class Hexagone extends Shapes
{
	private double side;
	private double area;
//	public Hexagone()
//	{
//		super();
//	}
	public Hexagone(String color,Outline outLine,String unit,double side)
	{
		super(color,outLine,unit);
		if(HexagoneValidation.verifyside(unit, side))
		{
			 this.side=side;
			 this.area=	2.59808*(side*side);
		}
		else
		{
			System.err.println("invalid side");
		}
	}
	
	public void printDetails()
	{
		 
			 
			 
		display();
		System.out.println("side :"+ side );
		System.out.println("area :"+area);
	}

}
