package com.lti.movierating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.movierating.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	

}
