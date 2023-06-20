package com.example.springbootblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootblog.models.Account;


public interface AccountRepository extends JpaRepository<Account, Long>{
}
