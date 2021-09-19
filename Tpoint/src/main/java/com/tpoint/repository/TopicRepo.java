package com.tpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpoint.entity.Topic;
@Repository
public interface TopicRepo extends JpaRepository<Topic, Integer>{

}
