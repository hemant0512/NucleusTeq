class Mathematics{
	public static void main(){
		int x, y;
		Scanner sc = new Scanner(System.in);  
        x = sc.nextInt();  
        y = sc.nextInt();
		int sum = x+y;
		int pro = x*y;
		int div = x/y;
		int sub = x-y;
		int rem = x%y;
		
		
		System.out.println("Remainder: "+rem);
		System.out.println("Subtraction: "+sub);
		System.out.println("Division: "+div);
		System.out.println("Product: "+pro);
		System.out.println("Sum: "+sum);
		
	}
}
