package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.RoomTypeEntity;
import com.example.Hotel_Mangement.repositories.RoomTypeRepository;
import com.example.Hotel_Mangement.services.RoomTypeService;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeServiceImpl extends CommonServiceImpl<RoomTypeEntity, Long, RoomTypeRepository> implements RoomTypeService {
    public RoomTypeServiceImpl(RoomTypeRepository repo) {
        super(repo);
    }
}
