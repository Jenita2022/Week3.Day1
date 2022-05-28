package week3.day1;

public class Students {
	//overloading methods

	public void getStudentInfo(int id) {
		System.out.println("Student ID" +id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID " +id +"  Name " +name);
	}
	public void getStudentInfo(long phone, String email) {
		System.out.println("Student Phone#" +phone +" Email " +email);
	}

	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo(101); 
		stu.getStudentInfo(102, "Samson");
		stu.getStudentInfo(987659009, "abc@email.com");
	}

}
