package com.example.Hotel_Mangement.entities;

import com.example.Hotel_Mangement.enums.StatusRoomEnum;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Rooms")
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "room_number", unique = true, nullable = false)
    String roomNumber;
    @Column(name = "room_type", nullable = false)
    String roomType;
    @Column(name = "status", nullable = false)
    StatusRoomEnum status;
}
