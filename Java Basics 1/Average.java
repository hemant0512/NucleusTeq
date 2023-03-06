class Average{
	public static void main(String args[]){
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();  
        y = sc.nextInt(); 
		z = sc.nextInt();
		int avg = (x+y+z)/3;
		
		System.out.println("Average: "+avg);
	}
}