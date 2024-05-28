package com.blps.lab1.repo;

import com.blps.lab1.dto.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
    Optional<Message> findById(Long id);
}
