package com.blps.lab1.repo;

import com.blps.lab1.dto.User;
import com.blps.lab1.dto.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);

    Boolean existsByEmail(String email);

    List<User> findAllByRolesName(ERole role);

}