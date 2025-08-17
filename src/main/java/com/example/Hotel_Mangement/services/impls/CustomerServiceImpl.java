package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.CustomerEntity;
import com.example.Hotel_Mangement.repositories.CustomerRepository;
import com.example.Hotel_Mangement.services.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends CommonServiceImpl<CustomerEntity, Long, CustomerRepository> implements CustomerService {
    public CustomerServiceImpl(CustomerRepository repo) {
        super(repo);
    }


    @Override
    public CustomerEntity update(CustomerEntity customerEntity) {
        return repo.save(customerEntity);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public CustomerEntity findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
