package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController {

	@Autowired
	StudentDetailsService sr;
	
	@GetMapping("/Saveall")
	public String saveall(@RequestBody List<StudentDetails> s)throws AgeException{
		return sr.saveall(s);
	}
	@GetMapping("/findall")
	public List<StudentDetails> findall(){
		return sr.findall();
	}
	@PostMapping("/save")
	public String save(@RequestBody StudentDetails s) throws AgeException{
		return sr.save(s);
	}
	@GetMapping("/getbyid/{id}")
	public StudentDetails findbyid(@PathVariable int id) {
		return sr.findbyid(id);
	}
	@GetMapping("/getbyid")
	public StudentDetails getid(@RequestParam(value="manoj") int id) {
		return sr.findbyid(id);
	}
	@PutMapping("updatebyid/{id}")
	public String updatebyid(@PathVariable int id) {
		return sr.updatebyid(id);
	}
	@GetMapping("/deletebyid/{id}")
	public String deleteid(@PathVariable int id) {
		return sr.deleteid(id);
	}
	@GetMapping("/getattendance/{roll}")
	public int getattendance(@PathVariable  int roll){
		return sr.getattendance(roll);
	}
}
