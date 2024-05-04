package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MarkSheetDao {
	
	@Autowired 
	MarkSheetRepository mr;
	
	public String saveall(List<MarkSheet>m) {
		mr.saveAll(m);
		return "Saved all";
	}
	public int getbyrollfirst(int roll){
		return mr.getbyrollfirst(roll);
	}
//	public int getbyrollsecond(int roll){
//		return mr.getbyrollsecond(roll);
//	}
//	public List<MarkSheet> getall(int roll){
//		return mr.getall(roll);
//	}

}
