package studentProject;

import java.util.List;
import java.util.ArrayList;
import java.util.List;


public class StudentImplimentation implements StudentOperations{

	ArrayList<Student> al=new ArrayList<Student>();
	private int studentId;

	@Override
	public void addStudent(Student student) {
		al.add(student);
		System.out.println("student added successfully");
		
	}

	@Override
	public Student findStudentById(int stuId) {
		for(Student stu:al) {
			if(stu.studentId==stuId) {
				System.out.println(stu);
				break;
			}
			else {
				System.out.println("no data");
				break;
			}
			
		}
		return null;
	}


	@Override
	public boolean updateStudent(int studentId, Student updatedStudentData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkStudentExist(String name, String course) {
		// TODO Auto-generated method stub
		return false;
	}

}
