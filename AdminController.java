package com.medicare.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.Medicine;
import com.medicare.service.AdminService;


@RestController
@RequestMapping("/rest/medicines/")
public class AdminController {
	@Autowired
	private AdminService iAdminService;
	
	@PostMapping("/create")  
	public  int saveBook(@RequestBody Medicine medicine)   
	{  
		iAdminService.create(medicine); 
	return medicine.getMedicineId();  
	} 	
	@PutMapping("/update")  
	public Medicine update(@RequestBody Medicine medicine)   
	{  
		iAdminService.update(medicine, medicine.getMedicineId());
		System.out.println("medicine update "+medicine.getMedicineId());
	return medicine;  
	}
	@DeleteMapping("/delete/{medicine_Id}")
	public void deleteData(@PathVariable("medicine_Id") Integer medicine_Id) {
	System.out.println("deleted successfully"+"'medicine_Id'"+medicine_Id);
		iAdminService.delete(medicine_Id);
	}
@GetMapping("/get/{medicine_Id}")
	public Medicine getById(@PathVariable("medicine_Id") Integer medicine_Id) {
		return iAdminService.getMedicineById(medicine_Id);
		
	}

@GetMapping("/getall")
public Set<Medicine> getAllMedicine(){
return iAdminService.getAllMedicineData();
	}
}
