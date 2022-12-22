package com.HotelReservation.Repository;

import com.HotelReservation.Entity.DeluxRoomBookingEntity;
import com.HotelReservation.Entity.StandardRoomBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StandardRoomBookingRepository extends JpaRepository<StandardRoomBookingEntity,Integer> { }
