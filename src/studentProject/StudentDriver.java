package studentProject;

public class StudentDriver {
	public static void main(String[] args) {
		
		//add students
		StudentImplimentation s=new StudentImplimentation();
		Student s1=new Student(101,"Ram",20,"cse");
		Student s2=new Student(102,"Vicky",21,"csm");
		s.addStudent(s1);
		s.addStudent(s2);
		//find by id
		s.findStudentById(106);
	}


}
