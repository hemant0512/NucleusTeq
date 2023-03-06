
import java.util.*;
class CompoundInterest{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Compound Interest Program");
		System.out.println("Enter principal amount");
		double p=sc.nextFloat();
		System.out.println("Enter rate of interest");
		double r=sc.nextFloat();
		System.out.println("Enter Time");
		double t=sc.nextFloat();
		double Amt= p * Math.pow(1.0+r/100.0,t);
		System.out.println("The Compound Interst is:"+(float)(Amt-p));
		System.out.println("The Amount is:"+(float)Amt); 
	}
}