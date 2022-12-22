package com.HotelReservation.Repository;

import com.HotelReservation.Entity.DeluxRoomBookingEntity;
import com.HotelReservation.Entity.SuitRoomBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuitRoomBookingRepository extends JpaRepository<SuitRoomBookingEntity,Integer> {
}
