package day13statickeyword;

public class ReviewStudents {
	public String name;
	public int age;
	public static int numOfStudents;
	public String studentId;
	
	
	public ReviewStudents()
	{
		this.name="Ali Can";
		this.age=12;
		numOfStudents++;
		this.studentId= name.substring(0,1)+age+numOfStudents;
	}
	
	public ReviewStudents(String name, int age)
	{
		this.name=name;
		this.age=age;
		numOfStudents++;
		this.studentId= name.substring(0,1)+age+numOfStudents;
		
	}
	
	public ReviewStudents(String name)
	{
		this.name= name;
		numOfStudents++;
		this.studentId= name.substring(0,1)+age+numOfStudents;
		
		
	}

	

	public static void main(String[] args) {
		
		System.out.println(numOfStudents);
		
		ReviewStudents s1= new ReviewStudents();
		System.out.println(numOfStudents);
		System.out.println("Student ID:" + s1.studentId);
		
		ReviewStudents std2 = new ReviewStudents();
		System.out.println("Student ID:"+std2.studentId);
		System.out.println("After std1 and std2 creation: " + numOfStudents);//2
		
		Students std3 = new Students("Veli Han", 13);
		System.out.println(std3.studentId);
		System.out.println(std3.age);
		System.out.println("After std1, std2, and std3 creation: " + numOfStudents);//3
		
		
		Students std4 = new Students("Maru Star");
		System.out.println(std4.studentId);
		System.out.println(std4.age);
		System.out.println("After std1, std2, std3, and std4 creation: " + numOfStudents);//4
		
		
		
		
		

	}

}
