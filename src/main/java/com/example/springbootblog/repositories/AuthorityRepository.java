package com.example.springbootblog.repositories;

import com.example.springbootblog.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
