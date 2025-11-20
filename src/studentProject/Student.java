package studentProject;

public class Student {
	int studentId;
	String name;
	int age;
	String course;
	public Student(int studentId, String name, int age, String course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	



}
