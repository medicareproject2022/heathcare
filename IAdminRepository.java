package com.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.model.Medicine;

public interface IAdminRepository extends JpaRepository<Medicine, Integer>{

}
