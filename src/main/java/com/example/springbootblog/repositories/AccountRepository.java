package com.example.springbootblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootblog.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
}
