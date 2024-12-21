package Studentlapdoc.Studentlapdoc;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	 private int id;
      private String Lapname;
     @ManyToMany
     private List<Student> student=new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLapname() {
		return Lapname;
	}
	public void setLapname(String lapname) {
		Lapname = lapname;
	}
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", Lapname=" + Lapname + "]";
	}
	
      
      
}
