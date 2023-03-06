import java.util.*;
class CurrencyConvertor
{
	public static void main(String ar[])
	{
	
	System.out.println("Program of Currency Conversion");
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the amt");
	double amt=sc.nextFloat();
	System.out.println("Please enter your choice");
	System.out.println("Press 1 for INR(Indian Rupee) to US Dollars");
	System.out.println("Press 2 for UD Dollars to INR(Indian Rupee) Dollars");
	System.out.println("Press 3 for INR to PKR(Pakistan Rupee)");
	System.out.println("Press 4 for PKR(Pakistan Rupee) to INR(Indian Rupee)");
	System.out.println("Press 5 for INR(Indian Rupee) to CAD(Canadian Dollar)");
	int x=sc.nextInt();
	switch(x)
	{
		case 1:
		{	
			amt=amt/80;
			System.out.println(amt+" US Dollars");
		break;
		}
		case 2:
		{	
			amt=amt*80;
			System.out.println(amt+" INR");
		break;
		}
		case 3:
		{	
			amt=amt*3.14;
			System.out.println(amt+" INR");
		break;
		}
		case 4:
		{	
			amt=amt/3.14;
			System.out.println(amt+" PKR");
		break;
		}
		case 5:
		{	
			amt=amt/60.87;
			System.out.println(amt+" CAD");
		break;
		}
		case 6:
		{	
			amt=amt*60.87;
			System.out.println(amt+" INR");
		break;
		}
		default:
			System.out.println("Invalid Choice");
			break;
	}
	}
}