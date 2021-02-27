
public class Teacher_Class {
	
	// Teachers will have their own id's
	private int id;
	
	// Teachers also have their name
	private String name;
	
	// Store teacher salary as well
	private int salary;
	
	// Grade they teach
	private int grade;
	
	// Constructor for teacher
	public Teacher_Class(int id, String name, int salary, int grade) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	// Teacher can update their salary and grade
	public void update_salary(int salary) {
		this.salary = salary;
	}
	
	public void update_grade(int grade) {
		this.grade = grade;
	}
	
	// Getters
	public String get_Name() {
		return this.name;
	}
	
	public int get_salary() {
		return this.salary;
	}
	
	// Print
	public void print() {
		System.out.print(" Teacher Name: " + this.name + " Grade taught: " + this.grade + " Salary: " + this.salary);
	}

}
