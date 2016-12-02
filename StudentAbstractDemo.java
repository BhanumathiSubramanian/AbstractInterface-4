abstract class Student
{
	
	abstract void StudentData(int StudentRoll,String Name, int RegNum);
	
}
class Year extends Student
{
	int marks;
	void StudentData(int StudentRoll, String Name, int RegNum) {
		
			System.out.println("Your Student Details of Year 2000 ");
			System.out.println("Your Name is:  " + Name);
			System.out.println("Your Roll Number: " + StudentRoll);
			System.out.println("Your Registration Number: " + RegNum);
			
	}
}
class Year1 extends Student
{
	int marks;
	void StudentData(int StudentRoll, String Name, int RegNum) {
		
			System.out.println("Your Student Details of Year 2001 ");
			System.out.println("Your Name is:  " + Name);
			System.out.println("Your Roll Number: " + StudentRoll);
			System.out.println("Your Registration Number: " + RegNum);
			
	}
}

public class StudentAbstractDemo {

	public static void main(String[] args) {
		Year c= new Year();
		c.StudentData(1, "Bhanu", 100);
		Year1 c1= new Year1();
		c1.StudentData(2, "Kumar", 200);
	}

}
