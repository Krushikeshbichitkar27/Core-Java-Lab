/*
@ Program: Print the number is palindrome or not
code by : Krushikesh
Date : 18/08/22
*/
class PalindromeDemo
{
static void checkPalindrome()
{
int r,num=0,temp;
int n=385; // the number variable to check palindrome
temp =n;
while(n>0)
{
r=n%10;  //getting reminder
num=(num*10)+r;
n=n/10;
}
if(temp==num)
System.out.println("----The number "+ temp +" is palindrome");
else
System.out.println("----The number "+ temp +" is not palindrome");
}
//calling main method
public static void main(String args[])
{
	checkPalindrome();
}
}