package com.HotelReservation.Mapper;

import com.HotelReservation.DTO.RoomBookingDTO;
import com.HotelReservation.Entity.StandardRoomBookingEntity;
import org.springframework.stereotype.Component;

@Component
public class StandardRoomBookingMapper {
    public StandardRoomBookingEntity StandardRoomBookingENTITY(RoomBookingDTO roomBookingDTO){
        StandardRoomBookingEntity entity=new StandardRoomBookingEntity();

        //Room no only if we enter it manually or if your generating it automatically then remove entity.setRoomNo(roomBookingDTO.getRoomNo());
        entity.setRoomNo(roomBookingDTO.getRoomNo());
        entity.setName(roomBookingDTO.getName());
        entity.setAge(roomBookingDTO.getAge());
        entity.setdOB(roomBookingDTO.getdOB());
        entity.setContact(roomBookingDTO.getContact());
        entity.setPlaceOfOrigin(roomBookingDTO.getPlaceOfOrigin());
        entity.setRoomType(roomBookingDTO.getRoomType());

        return entity;
    }

    public RoomBookingDTO StandardRoomBookingDTO(StandardRoomBookingEntity entity){
        RoomBookingDTO roomBookingDTO=new RoomBookingDTO();

        roomBookingDTO.setRoomNo(entity.getRoomNo());
        roomBookingDTO.setName(entity.getName());
        roomBookingDTO.setAge(entity.getAge());
        roomBookingDTO.setdOB(entity.getdOB());
        roomBookingDTO.setContact(entity.getContact());
        roomBookingDTO.setPlaceOfOrigin(roomBookingDTO.getPlaceOfOrigin());
        roomBookingDTO.setRoomType(entity.getRoomType());

        return roomBookingDTO;
    }
}
