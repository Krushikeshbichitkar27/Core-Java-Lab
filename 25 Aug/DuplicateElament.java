/*
Program:Java program to check print duplicate number
@code by:Krushikesh
date:25/08/22
*/


//declaring class
class DuplicateElement 
{  
    static void findDuplicate(int ...arr);
	{      
          
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++)
		{  
            for(int j = i + 1; j < arr.length; j++)
			{  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    } 
			//calling main method
	public static void main(String ...args)
	{
		findDuplicate();
	}  
}  
