package com.medicare.service;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medicare.model.Medicine;
import com.medicare.repo.IAdminRepository;

@Service
@Transactional
public class AdminService  {
	@Autowired
	private IAdminRepository adminRepository;

	@Transactional	
	public void create(Medicine medicine)   
	{  
		adminRepository.save(medicine);  
		System.out.println("medicine"+medicine);
	}  
	@Transactional
	public void update(Medicine medicine, Integer medicine_Id)   
	{  
		adminRepository.save(medicine);
	} 
	@Transactional
	public void delete(Integer medicine_Id) {
		adminRepository.deleteById(medicine_Id);
	
}
@Transactional(readOnly = true)
	public Medicine getMedicineById(Integer medicine_Id) {
		return adminRepository.findById(medicine_Id).get();
		
}
	@Transactional(readOnly = true)
public Set<Medicine> getAllMedicineData(){
		Set<Medicine> medin=new LinkedHashSet<Medicine>();
		adminRepository.findAll().forEach(medicine11->medin.add(medicine11));
	return medin;

	}}
