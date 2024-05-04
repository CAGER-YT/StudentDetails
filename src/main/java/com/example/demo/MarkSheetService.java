package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;
	
	public String saveall(List<MarkSheet>m) {
		for(MarkSheet x:m) {
			int total1=x.getSem1practical()+x.getSem1theory();
			int total2=x.getSem2practical()+x.getSem2theory();
			x.setSem1total(total1);
			x.setSem2total(total2);
		}
		return md.saveall(m);
	}

	public int getbyrollfirst(int roll){
		return md.getbyrollfirst(roll);
	}
//	public List<MarkSheet> getall(int roll){
//		return md.getall(roll);
//	}
//	public int getbyrollsecond(int roll){
//		return md.getbyrollsecond(roll);
//	}
}
