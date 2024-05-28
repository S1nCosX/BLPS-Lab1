package com.blps.lab1.repo;

import com.blps.lab1.dto.MessageHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface MessageHistoryRepo extends JpaRepository<Set<MessageHistory>, Long> {
    Optional<Set<MessageHistory>> findById(Long id);
}
