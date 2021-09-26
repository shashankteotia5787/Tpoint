package com.tpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpoint.entity.Concept;

@Repository
public interface ConceptRepo extends JpaRepository<Concept, Integer> 
{

}
