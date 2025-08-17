package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.ServiceEnity;
import com.example.Hotel_Mangement.repositories.ServiceRepository;
import com.example.Hotel_Mangement.services.ServiceService;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl extends CommonServiceImpl<ServiceEnity, Long, ServiceRepository> implements ServiceService {
    public ServiceServiceImpl(ServiceRepository repo) {
        super(repo);
    }
}
