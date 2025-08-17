package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.RoomEntity;
import com.example.Hotel_Mangement.repositories.RoomRepository;
import com.example.Hotel_Mangement.services.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends CommonServiceImpl<RoomEntity, Long, RoomRepository> implements RoomService {
    public RoomServiceImpl(RoomRepository repo) {
        super(repo);
    }
}
