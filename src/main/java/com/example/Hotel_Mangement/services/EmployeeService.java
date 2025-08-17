package com.example.Hotel_Mangement.services;

import com.example.Hotel_Mangement.entities.EmployeeEntity;

import java.util.List;

public interface EmployeeService extends CommonService<EmployeeEntity,Long> {
    EmployeeEntity findById(Long id);
    List<EmployeeEntity> findAll();
    EmployeeEntity save(EmployeeEntity employee);
    void deleteById(Long id);
}
