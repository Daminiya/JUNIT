package com.example.CreateWelfare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CreateWelfare.Entity.WelfareType;

public interface WelfareTypeRepository extends JpaRepository< WelfareType, Integer> {

}
