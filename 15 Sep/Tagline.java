/*
Program : write program to print tagline of brand using switch
Code by : krushikesh
Date : 15 September 2022
*/
class Tagline
{
     //mathod to print tagline
	static void printTagline()
	{
	String brand="Nike";  
		switch (brand)
		{
            case "Adidas" -> System.out.println("Adidas is all in" + brand );
			case "Nike" -> System.out.println("Just do it" + brand);
			case "Jordan" -> System.out.println("Yes,it is Jordan" + brand);
			case "Skechers" -> System.out.println("Just blew it" + brand);
			case "Woodland" -> System.out.println("Leather that weathers"+ brand);
			default -> System.out.println("Wrong Input");
		}
	}
	 //calling main method
     public static void main(String args[])
    {
      printTagline(); //print method printTagline
	  
    }
}	
