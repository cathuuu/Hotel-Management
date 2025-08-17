package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.EmployeeEntity;
import com.example.Hotel_Mangement.repositories.EmployeeRepository;
import com.example.Hotel_Mangement.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends CommonServiceImpl<EmployeeEntity, Long, EmployeeRepository> implements EmployeeService {
    public EmployeeServiceImpl(EmployeeRepository repo) {
        super(repo);
    }

    @Override
    public EmployeeEntity findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeEntity> findAll() {
        return repo.findAll();
    }
}
