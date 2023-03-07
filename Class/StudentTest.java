import student.Student;
class StudentTest{
	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();	
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.setRollNo(18);
		s1.setName("Virat Kohli");
		s1.setCourse("CS");
		s1.setMarks1(90);
		s1.setMarks2(95);
		s1.setMarks3(100);
		
		
		
		s2.setRollNo(45);
		s2.setName("Rohit Sharma");
		s2.setCourse("IT");
		s2.setMarks1(80);
		s2.setMarks2(85);
		s2.setMarks3(95);
			
		s3.setRollNo(07);
		s3.setName("Dhoni");
		s3.setCourse("ETC");
		s3.setMarks1(95);
		s3.setMarks2(98);
		s3.setMarks3(50);	
	
		s4.setRollNo(333);
		s4.setName("Chris");
		s4.setCourse("EE");
		s4.setMarks1(90);
		s4.setMarks2(90);
		s4.setMarks3(90);
		
		s5.setRollNo(1);
		s5.setName("Rahul");
		s5.setCourse("ETC");
		s5.setMarks1(80);
		s5.setMarks2(90);
		s5.setMarks3(70);
		
		
		System.out.println("Details of "+s1.getName());
		System.out.println("Total marks of student is:"+s1.calculateTotal());
		System.out.println("Average marks of student is:"+s1.calculateAverage());
		System.out.println("Grade of student is:"+s1.calculateGrade());
		System.out.println("\n");
		
		System.out.println("Details of "+s2.getName());
		System.out.println("Total marks of student is:"+s2.calculateTotal());
		System.out.println("Average marks of student is:"+s2.calculateAverage());
		System.out.println("Grade of student is:"+s2.calculateGrade());
		System.out.println("\n");
		
		System.out.println("Details of "+s3.getName());;
		System.out.println("Total marks of student is:"+s3.calculateTotal());
		System.out.println("Average marks of student is:"+s3.calculateAverage());
		System.out.println("Grade of student is:"+s3.calculateGrade());
		System.out.println("\n");

		System.out.println("Details of "+s4.getName());
		System.out.println("Total marks of student is:"+s4.calculateTotal());
		System.out.println("Average marks of student is:"+s4.calculateAverage());
		System.out.println("Grade of student is:"+s4.calculateGrade());
		System.out.println("\n");
		
		
		System.out.println("Details of "+s5.getName());
		System.out.println("Total marks of student is:"+s5.calculateTotal());
		System.out.println("Average marks of student is:"+s5.calculateAverage());
		System.out.println("Grade of student is:"+s5.calculateGrade());
		System.out.println("\n");
	}
}