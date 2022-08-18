/*
Program : write program to print tagline of brand using switch
Code by : krushikesh
Date : 18 Augest 2022
*/
class Tagline
{
     //mathod to print days according to day number 
	static void printTagline()
	{
	String brand="Disneyland";
		switch (brand)
		{
            case "Im going to Disneyland" -> System.out.println("The tagline of "+ brand + "is:" );
			case "just do it" -> System.out.println("The tagline of "+ brand + "is:");
			case "Do what you cant" -> System.out.println("The tagline of "+ brand + "is:");
			case "Move the way you want" -> System.out.println("The tagline of "+ brand + "is:");
			case "Save money.Live better" -> System.out.println("The tagline of "+ brand + "is:");
			default -> System.out.println("Wrong Input");
		}
	}
	 //calling main method
     public static void main(String args[])
    {
      printTagline();
	  
    }
}	