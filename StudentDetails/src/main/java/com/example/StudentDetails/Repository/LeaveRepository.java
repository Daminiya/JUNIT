package com.example.StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentDetails.Entity.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer> {

}
