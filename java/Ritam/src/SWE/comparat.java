package SWE;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Student3{
	private int roll_no;
	private String name;
	private char section;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+this.roll_no+" ,"+this.name+" ,"+this.section+" }";
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public  Student3(int roll_no, String name, char section) {
		this.roll_no = roll_no;
		this.name = name;
		this.section = section;
	}
	
	
}

class CompareRoll implements Comparator<Student3>{
	@Override
	public int compare(Student3 o1, Student3 o2) {
		return o1.getRoll_no()-o2.getRoll_no();
	}
}

class CompareSection implements Comparator<Student3>{
	@Override
	public int compare(Student3 o1, Student3 o2) {
		return o1.getSection()-o2.getSection();
	}
}

class CompareName implements Comparator<Student3>{
	@Override
	public int compare(Student3 o1, Student3 o2) {
		return o1.getName().compareTo(o2.getName());
	}
}


public class comparat {
	public static void main(String[] args) {
//		ArrayList<Student3> al2= new ArrayList<Student3>();
//		al2.add(new Student3(1,"f",'a'));
//		al2.add(new Student3(3,"d",'b'));
//		al2.add(new Student3(8,"s",'a'));
//		al2.add(new Student3(4,"a",'l'));
//		System.out.println(al2);
//		al2.sort(new CompareName());
//		System.out.println(al2);
//		al2.sort(new CompareRoll());
//		System.out.println(al2);
//		al2.sort(new CompareSection());
//		System.out.println(al2);
//		Iterator<Student3> it = al2.iterator();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		LocalDate l = LocalDate.now();
		System.out.println(l);
		System.out.println(l.minusDays(5));
	    	
	}

}