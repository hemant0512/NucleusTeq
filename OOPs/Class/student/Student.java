package student;
public class Student{
	private int rollNumber;
	private String name;
	private String course;
	private double marks1, marks2, marks3;
	
	public void setRollNo(int rollNumber){
		this.rollNumber = rollNumber;
	}
	public int getRollNo(){
		return rollNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return course;
	}
	
	
	public void setMarks1(double marks1)
	{
		this.marks1=marks1;
	}
	public double getMarks1()
	{
		return marks1;
	}
	
	
	public void setMarks2(double marks2)
	{
		this.marks2=marks2;
	}
	public double getMarks2()
	{
		return marks2;
	}
	
	
	public void setMarks3(double marks3)
	{
		this.marks3=marks3;
	}
	
	public double getMarks3()
	{
		return marks3;
	}
	
	
	public double calculateTotal()
	{
		return marks1+marks2+marks3;
	}
	public double calculateAverage()
	{
		return (marks1+marks2+marks3)/3;
	}
	
	public String calculateGrade()
	{
		int average=(int)calculateAverage();
		String grade;
		if(average >= 90){
			grade = "A";
		}
		else if(average >= 80 && average < 90){
			grade = "B";
		}
		else if(average >= 70 && average < 80){
			grade = "C";
		}
		else if(average >= 50 && average < 70){
			grade = "D";
		}
		else {
		grade = "F";
		}
		return grade;
	}
	
}