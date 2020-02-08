package Assignment5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



public class Entry {

	public static void main(String[] args) {
		
		LinkedList<Student> studentList = new LinkedList<>();
		studentList.add( new Student ("Deepti",2));
		studentList.add( new Student ("Gayatri",1));
		studentList.add( new Student ("Sushma",3));
		studentList.add( new Student ("Kavita",4));
		studentList.add( new Student ("Abhi",5));
		
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()){
			Student tempStudent = it.next();
			System.out.println("1.Student " + tempStudent.Id + "  name is  "+ tempStudent.name);
		}
		
		Collections.sort(studentList);
		
		Iterator<Student> it1 = studentList.iterator();
		while(it1.hasNext()){
			Student tempStudent = it1.next();
			System.out.println("2.Student " + tempStudent.Id + "  name is  "+ tempStudent.name);
		

	}

	}}
