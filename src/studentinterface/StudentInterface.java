package studentinterface;

interface StudentDetails{
	String StudentName = "";
	int studentAge = 0;
	String semester = "";
	
	public void addStudents();
	public void deleteStudent();
	public void editStudent();
}

class Student implements StudentDetails{
	String StudentName = "";
	int studentAge = 0;
	String semester = "";
	
	public void addStudents() {
		
	}
	public void deleteStudent() {
		
	}
	public void editStudent() {
		
	}
	
	public void printStudent() {
		
	}
}


