package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer>{
	
	@Query(value = "select sem1total+sem2total from marksheet where rollnumber =?",nativeQuery = true)
	public int getbyrollfirst(int roll);
	
//	@Query(value = "select sem2total from marksheet where rollnumber =?",nativeQuery = true)
//	public int getbyrollsecond(int roll);
//	@Query(value = "select id,rollnumber,sem1total,sem2total from marksheet where rollnumber =?",nativeQuery = true)
//	public List<MarkSheet> getall(int roll);
}
