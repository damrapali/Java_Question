package Assignment5;

public class Student implements Comparable<Student>{
	public String name;
	public int Id;
	
	Student(String name, int Id) {
		this.name = name;
		this.Id = Id;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.Id - o.Id;
	}

		
}
