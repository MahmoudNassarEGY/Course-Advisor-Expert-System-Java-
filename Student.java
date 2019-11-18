import java.util.Scanner;
public class Student {
	int StudentID;
	String Major;
	int year;
	
	Student(){
		
	}
	
	Student(int StudentID , String Major , int year ){
		this.StudentID = StudentID;
		this.Major = Major;
		this.year = year;
		
		
	}
	public int getStudentID(){
		return StudentID;
	}
	public String getMajor(){
		return Major;
	}
	public int getyear(){
		return year;
	}
	public void setMajor(String Major){
		this.Major = Major;
	}
	
}
