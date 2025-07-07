package oops_programming_style7;
import java.util.*;
public class ShapeMAinClass
{
	 
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter......");
		 
		 Shapes shape=null;
		 double base=0;
		 double height=0;
		 String color=null;
		 
         double outlineThickness = 0.0; 
         String outlineColor= null;
         String outlineStyle=null;   
		 String unit=null;
		 double side=0;
		 while(true)
		 {
			 System.out.println("press 1 for traingle..");
			 System.out.println("press 2 for pentagone..");
			 System.out.println("press 3 for hexagone..");
			 System.out.println("enter your choise..");
			 int choise=sc.nextInt();
			 switch(choise)
			 {
			 case 1: System.out.println("enter triangle details");
			         System.out.println("enter triangle height");
			         height=sc.nextDouble();
			         System.out.println("enter triangle base");
			         base=sc.nextDouble();
			         System.out.println("enter triangle unit");
			         unit=sc.next();
			         System.out.println("enter triangle color");
			         color=sc.next();
			         System.out.println("enter triangle outLine thickness");
			         outlineThickness = sc.nextDouble();
			         System.out.println("enter triangle outLine  color");
			         outlineColor=sc.next();
			         System.out.println("enter triangle outLine  style");
			          outlineStyle=sc.next();
			          
			         shape=new Triangle( color,new Outline(outlineThickness, color, outlineStyle), unit, base, height);
			         break;
			 case 2: System.out.println("enter penagone details");
	                
	                
	                  System.out.println("enter pentagone unit");
	                  unit=sc.next();
	                  System.out.println("enter pentagone color");
	                  color=sc.next();	            
	                  System.out.println("enter pentagone outLine thickness");
				      outlineThickness = sc.nextDouble();
       	              System.out.println("enter triangle outLine  color");	 
				      outlineColor=sc.next();
				      System.out.println("enter pentagone outLine style");
				      outlineStyle=sc.next();
	                  System.out.println("enter pentagone side");
	                  side=sc.nextDouble();
	                  shape=new Pentagone( color, new Outline(outlineThickness, color, outlineStyle), unit,side);
	                  break;  
			 case 3: System.out.println("enter hexagone details");
                     System.out.println("enter  hexagone unit");
                     unit=sc.next();
                     System.out.println("enter  hexagone color");
                     color=sc.next();
                     System.out.println("enter hexagone outLine thickness");
			         outlineThickness = sc.nextDouble();
			         System.out.println("enter hexagone outLine color");
			         outlineColor=sc.next();
			         System.out.println("enter hexagone outLine style");
			         outlineStyle=sc.next();
			          
                   
                     System.out.println("enter  hexagone side");
                     side=sc.nextDouble();
                     shape=new Hexagone( color, new Outline(outlineThickness, color, outlineStyle), unit,side);
                     break;
			 }
			 shape.printDetails();
			   System.out.println("enter y to continue"); 
			   System.out.println("enter n to exist"); 
			   char statuse =  sc.next().charAt( 0);
			   if(statuse=='n'||statuse=='N')
			   {
				   break;
			   }
			 
			   
		 }
		 System.out.println("exist.....");
	}
	
	

}
