package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer>{
	
	@Query(value = "SELECT attendance from student where rollnumber=?",nativeQuery = true)
	public int getattendance(int roll);

}
