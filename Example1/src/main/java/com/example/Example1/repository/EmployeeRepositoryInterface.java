package com.example.Example1.repository;

import com.example.Example1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepositoryInterface extends JpaRepository<Employee, Long>, JpaSpecificationExecutor {
    Optional<Employee> findByName(@Param("name") String productName);
}