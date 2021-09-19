package com.tpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpoint.entity.LoginDetails;

@Repository
public interface LoginDetailsRepo extends JpaRepository<LoginDetails, Integer>{

}
