


public class Student_Class {
	
	// Student will have id's
	private int id;
	
	// Students Name
	private String name;
	
	// Students Grade (1 - 12th)
	private int grade;
	
	// Cost of attendance
	private int cost;
	
	//Constructor creates a new student object through initialization
	public Student_Class(int id, String name, int grade, int cost) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.cost = cost;
	}
	
	//Students have ability to update grade, and cost
	
	public void update_grade(int grade) {
		this.grade = grade;
	}
	
	public void update_cost(int cost) {
		this.cost = cost;
	}
	
	// Getters
	public String get_name() {
		return this.name;
	}
	
	public int get_grade() {
		return this.grade;
	}
	
	public int get_cost() {
		return this.cost;
	}
	
	// Print
	public void print() {
		System.out.println("Student id: " + this.id + " Name: " + this.name + " Grade: " + this.grade + ".");
	}
	
}





