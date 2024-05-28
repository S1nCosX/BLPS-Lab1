package com.blps.lab1.repo;

import com.blps.lab1.dto.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlackListRepo extends JpaRepository<BlackList, Long> {
    Optional<BlackList> findById(Long id);
}
