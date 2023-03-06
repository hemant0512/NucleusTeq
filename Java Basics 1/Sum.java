import java.util.Scanner;
class Sum{
	public static void main(String args[]){
		int x, y;
		Scanner sc = new Scanner(System.in);  
        x = sc.nextInt();  
        y = sc.nextInt(); 
		int sum = x+y;
		
		System.out.println("Sum: "+sum);
	}
}