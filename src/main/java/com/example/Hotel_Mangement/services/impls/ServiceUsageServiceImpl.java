package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.ServiceUsageEntity;
import com.example.Hotel_Mangement.repositories.ServiceUsageRepository;
import com.example.Hotel_Mangement.services.ServiceUsageService;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsageServiceImpl extends CommonServiceImpl<ServiceUsageEntity, Long, ServiceUsageRepository> implements ServiceUsageService {
    public ServiceUsageServiceImpl(ServiceUsageRepository repo) {
        super(repo);
    }
}
