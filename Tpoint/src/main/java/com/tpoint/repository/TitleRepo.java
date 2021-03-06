package com.tpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpoint.entity.Title;
@Repository
public interface TitleRepo extends JpaRepository<Title, Integer>
{

}
