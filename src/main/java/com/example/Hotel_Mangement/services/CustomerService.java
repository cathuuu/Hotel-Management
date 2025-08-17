package com.example.Hotel_Mangement.services;

import com.example.Hotel_Mangement.entities.CustomerEntity;

public interface CustomerService extends CommonService<CustomerEntity, Long> {
   CustomerEntity save(CustomerEntity customerEntity);
   CustomerEntity update(CustomerEntity customerEntity);
   void delete(Long id);
   CustomerEntity findById(Long id);
}
