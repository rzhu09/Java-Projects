import java.util.List;


public class School{
	
	// A school has teachers and students
	// Utilize an array list here so updating is possible
	private List<Teacher_Class> teachers;
	
	private List<Student_Class> students;
	
	// Keep Track of cost and salaries
	
	private int total_earned;
	private int total_spendings;
	
	//Constructor
	public School(List<Teacher_Class> teachers, List<Student_Class> students, int te, int ts) {
		this.teachers = teachers;
		this.students = students;
		this.total_earned = te;
		this.total_spendings = ts;
	}
	
	// adds teacher and student
	public void add_teacher(Teacher_Class teacher) {
		this.teachers.add(teacher);
	}
	
	public void add_student(Student_Class student) {
		this.students.add(student);
	}
	
	// update
	
	public void update_teachers(List<Teacher_Class> teachers) {
		this.teachers = teachers;
	}
	
	public void update_students(List<Student_Class> student) {
		this.students = student;
	}
	
	//Getters
	public List<Teacher_Class> get_teachers(){
		return this.teachers;
	}
	
	public List<Student_Class> get_students(){
		return this.students;
	}
	
	public int get_earnings() {
		return this.total_earned;
	}
	
	public int get_spendings() {
		return this.total_spendings;
	}

}
