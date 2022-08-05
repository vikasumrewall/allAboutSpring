package mvccomplex.beans;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private String name;
	private String id;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dob;
	
	private List<String> course;
	private String gender;
	private String studentType;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public List<String> getCourse() {
		return course;
	}



	public void setCourse(List<String> course) {
		this.course = course;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getStudentType() {
		return studentType;
	}



	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", course=" + course + ", gender=" + gender
				+ ", studentType=" + studentType + "]";
	}
	
	

}
