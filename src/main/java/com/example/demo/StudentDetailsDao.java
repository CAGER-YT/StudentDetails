package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class StudentDetailsDao {

	@Autowired
	StudentDetailsRepository sr;
	
	public String saveall(List<StudentDetails> s) {
		sr.saveAll(s);
		return "Saved Successfully";
	}
	public List<StudentDetails> findall(){
		return sr.findAll();
	}
	public String save(StudentDetails s) {
		sr.save(s);
		return "Saved Successfully";
	}
	public StudentDetails findbyid(int id) {
		return sr.findById(id).get();
	}
	public String updatebyid(int id) {
		StudentDetails s=sr.findById(id).get();
		s.setAge(s.getAge());
		s.setName(s.getName());
		s.setAttendance(s.getAttendance());
		s.setCourse(s.getCourse());
		s.setGender(s.getGender());
		s.setRollnumber(s.getRollnumber());
		
		return "Updated Successfully";
	}
	public String deleteid(@PathVariable int id) {
		sr.deleteById(id);
		return "Deleted Successfully";
	}
	public int getattendance(int roll){
		return sr.getattendance(roll);
	}
}
