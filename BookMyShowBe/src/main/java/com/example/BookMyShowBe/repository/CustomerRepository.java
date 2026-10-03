package com.example.BookMyShowBe.repository;

import com.example.BookMyShowBe.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository <Customer,Long>{

    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);

    Optional<Customer> findByEmail (String email);

    Optional <Customer> findByPhone(String Phone);

}
