class Board{
	public String FinalExam() {
		String name="FinalExam";
		System.out.println(name);
		return name ;
	}
}
class School extends Board{
	public String SchoolExam() {
		String RollNo= "ID101";
		Board b= new Board();
		String name = b.FinalExam();
		System.out.println(name+":School Exam");
		return RollNo;
	}
}
class Student extends School{
	public void StudentInfo() {
		School s=new School();
		String name = s.FinalExam();
		String id   = s.SchoolExam();
		System.out.println("Student belongs to "+name+":"+id);
	
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.FinalExam();
		s.SchoolExam();
		s.StudentInfo();
		
	}

}
