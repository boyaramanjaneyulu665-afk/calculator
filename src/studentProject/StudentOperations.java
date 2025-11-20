package studentProject;

import java.util.List;

public interface StudentOperations {
	void addStudent(Student student);
	Student findStudentById(int studentId);
	boolean updateStudent(int studentId, Student updatedStudentData);
	boolean deleteStudent(int studentId);
	List<Student> getAllStudents();
	boolean checkStudentExist(String name,String course);


}
