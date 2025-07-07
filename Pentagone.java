package oops_programming_style7;

public class Pentagone extends  Shapes
{
	private double side;
    private double area;
    
	public Pentagone(String color, Outline outLine,String unit,double side)
	{
		super(color,outLine,unit);
		if(PentagoneValidation.verifyside(unit, side))
		{
		this.side=side;
		this.area=		1.72048*(side*side);
			 
			 
		}
		else
		{
			System.err.println("invalid side");
		}
	}
	
	public void printDetails()
	{
		 display();
		 System.out.println("side : "+side);
		 System.out.println("area :"+area);
	}

}
