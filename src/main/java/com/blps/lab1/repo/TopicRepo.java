package com.blps.lab1.repo;


import com.blps.lab1.dto.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicRepo extends JpaRepository<Topic, Long> {

    Optional<Topic> findById(Long id);
}