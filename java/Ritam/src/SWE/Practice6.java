package SWE;

import java.util.Scanner;

class Student{
	
	String name;
	double marks;
	
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public boolean equals(Object obj) //up-casting
	{
		Student s = (Student)obj;//down-casting
		return this.marks == s.marks;
	}
	public int hashCode() {
		return super.hashCode()+this.name.hashCode()+(int)this.marks;
	}
}

class Employee{
	private String name;
	private static int id=23124;
	private int empid;
	private String compamnyname="Capgemini";
	private String bloodGroup;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getId() {
		return id;
	}
	public String getCompamnyname() {
		return compamnyname;
	}
	public void setCompamnyname(String compamnyname) {
		this.compamnyname = compamnyname;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	Employee(String name,String Bloodgroup){
		this.name=name;
		this.bloodGroup=Bloodgroup;
		this.empid=++id;
	}
	
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return this.name.equals(e.name);
	}
	
	public int hashCode() {
		return super.hashCode()+ this.name.hashCode()+this.bloodGroup.hashCode();
	}
	
	public String toString() {
		return this.name+" "+this.id+" "+this.compamnyname+" "+this.bloodGroup;
	}
}


public class Practice6 {
	public static void main(String[] args) {
		
		
//		Student s1 = new Student("Ramesh" , 97.8);
//		Student s2 = new Student("Suresh" , 97.8);
//		Student s3 = new Student("Mukesh" , 79.25);
//		Student s4 = s1;
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s1.equals(s4) ? "Same" : "Not Same");
//		System.out.print(s1.hashCode()==s4.hashCode()?"Same":"not same");		
//		Employee e1 = new Employee("Ramesh","B positive");
//        System.out.println(e1.hashCode());
//        System.out.println(e1.toString());
//		int i =10;
//		Integer a=i;
//		int b = a.intValue();
		
		
        String s ;
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][7];
        for(int i=0;i<5;i++) {
        	for(int j=0;j<7;j++) {
        		
        	}
        }
        
        
        
        
        
        
        
        
	}

}
