/*
Program : creating class SbiBank to create accounts
Code:Krushikesh
Date : 22 september 2022
*/

//declaring class SbiBank

class SbiBank
{
	//main method
	public static void main(String ...args)
	{
		//-------Constructor injection ------//tight coupling
		
		//declaring objects of Account class
		Account acc1= new Account(11208,"Raj ",5800.0);
		Account acc2= new Account(11023,"Rahul ",1000.0);
		
		if(accBalance<1000)
		{
			System.out.println("You Need Minimum Account Balance :"+ getAccBalance)
		}
		
		// displaying the account
		System.out.println("Account ID:  "+acc1.getAccID()+"   Name:   "+acc1.getAccName()+"  Balance:  "+acc1.getAccBalance());
		System.out.println("Account ID:  "+acc2.getAccID()+"   Name:   "+acc2.getAccName()+"  Balance:  "+acc2.getAccBalance());
	
		
		}
	
}