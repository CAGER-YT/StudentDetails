package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentDetailsService {
	
	@Autowired
	StudentDetailsDao sd;
	
	public String saveall(List<StudentDetails> s)throws AgeException{
	    for (StudentDetails student : s) {
	        if (student.getAge() < 18) {
	            throw new AgeException();
	        }
	    }
			return sd.saveall(s);	

	}
	public List<StudentDetails> findall(){
		
		return sd.findall();
	}
	public String save(StudentDetails s) throws AgeException{
			if(s.getAge()<18) {
				 throw new AgeException();
			}else {
				return sd.save(s);
			}
		}
	public StudentDetails findbyid(int id) {
		return sd.findbyid(id);
	}
	public String updatebyid(int id) {
		
		return sd.updatebyid(id);
	}
	public String deleteid(int id) {
		return sd.deleteid(id);
	}
	public int getattendance(int roll){
		return sd.getattendance(roll);
	}
}
