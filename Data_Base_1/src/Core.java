import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Core {
	public static void main(String[]args) {

		Teacher_Class wada = new Teacher_Class(1,"wada",500,2);
		Teacher_Class kevin = new Teacher_Class(2,"kevin",700,10);
		Teacher_Class syracuse = new Teacher_Class(3,"syracuse",600,3);
		Teacher_Class nyc = new Teacher_Class(4,"nyc",600,4);

        List<Teacher_Class> teacherList = new ArrayList<>();
        teacherList.add(wada);
        teacherList.add(kevin);
        teacherList.add(syracuse);
        teacherList.add(nyc);

        Student_Class ray = new Student_Class(1,"ray",4, 1000);
        Student_Class kel = new Student_Class(2,"kel",12, 2000);
        Student_Class sam = new Student_Class(3,"sam",5, 1034);
        Student_Class shy = new Student_Class(4,"shy",5, 1003);
        List<Student_Class> studentList = new ArrayList<>();

        studentList.add(ray);
        studentList.add(kel);
        studentList.add(sam);
        studentList.add(shy);
        
        School ms104 = new School(teacherList, studentList, 1000000, 200000);
        
        List<Teacher_Class> ms104_teachers = ms104.get_teachers();
        
        for(Teacher_Class t : ms104_teachers) {
        	System.out.println(t.get_Name());
        }
        
        List<Student_Class> ms104_students = ms104.get_students();
        
        for(Student_Class s : ms104_students) {
        	System.out.println(s.get_name());
        }
        
        
	}
}
