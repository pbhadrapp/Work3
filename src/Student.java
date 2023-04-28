//parameter constructor 
//Write a program which creates a class “Student” with the following

public class Student {
	int slno;
	String name;
	int sub1,sub2,sub3;
	public Student(int slno,String name,int sub1,int sub2,int sub3)
	{
		this.slno = slno;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;			
	}
	void Display()
	{
		System.out.println("Slno: "+slno);
		System.out.println("Name: "+name);
		System.out.println("Sub1: "+sub1);
		System.out.println("Sub2: "+sub2);
		System.out.println("Sub3: "+sub3);
	}

	public static void main(String[] args) {
		Student s = new Student(1236,"bhadra",95,96,97);
		s.Display();

	}

}
