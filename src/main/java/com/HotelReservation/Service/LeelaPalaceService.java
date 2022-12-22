package com.HotelReservation.Service;

import com.HotelReservation.DTO.RoomBookingDTO;
import com.HotelReservation.Mapper.DeluxRoomBookingMapper;
import com.HotelReservation.Mapper.StandardRoomBookingMapper;
import com.HotelReservation.Mapper.SuitRoomBookingMapper;
import com.HotelReservation.Repository.DeluxRoomBookingRepository;
import com.HotelReservation.Repository.StandardRoomBookingRepository;
import com.HotelReservation.Repository.SuitRoomBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeelaPalaceService {
    @Autowired
    private DeluxRoomBookingRepository deluxRepository;
    @Autowired
    private StandardRoomBookingRepository standardRepository;
    @Autowired
    private SuitRoomBookingRepository suitRepository;
    @Autowired
    private DeluxRoomBookingMapper DeluxMapper;
    @Autowired
    private StandardRoomBookingMapper StandardMapper;
    @Autowired
    private SuitRoomBookingMapper SuitMapper;

    public RoomBookingDTO DeluxRoomBooking(RoomBookingDTO roomBookingDTO){
       return DeluxMapper.DeluxRoomBookingDTO(deluxRepository.save(DeluxMapper.DeluxRoomBookingENTITY(roomBookingDTO)));
    }
    public RoomBookingDTO StandardRoomBooking(RoomBookingDTO roomBookingDTO){
        return StandardMapper.StandardRoomBookingDTO(standardRepository.save(StandardMapper.StandardRoomBookingENTITY(roomBookingDTO)));
    }
    public RoomBookingDTO SuitRoomBooking(RoomBookingDTO roomBookingDTO){
        return SuitMapper.SuitRoomBookingDTO(suitRepository.save(SuitMapper.SuitRoomBookingENTITY(roomBookingDTO)));
    }
    public RoomBookingDTO GetDeluxRoomByID(int id){
        return DeluxMapper.DeluxRoomBookingDTO(deluxRepository.getReferenceById(id));
    }
    public RoomBookingDTO GetStandardRoomByID(int id){
        return StandardMapper.StandardRoomBookingDTO(standardRepository.getReferenceById(id));
    }
    public RoomBookingDTO GetSuitRoomByID(int id){
        return SuitMapper.SuitRoomBookingDTO(suitRepository.getReferenceById(id));
    }

    public RoomBookingDTO DeleteDeluxRoomByID(int id){
        return DeluxMapper.DeluxRoomBookingDTO(deluxRepository.getReferenceById(id));
    }

    public RoomBookingDTO DeleteStandardRoomByID(int id){
        return StandardMapper.StandardRoomBookingDTO(standardRepository.getReferenceById(id));
    }
    public RoomBookingDTO DeleteSuitRoomByID(int id){
        return SuitMapper.SuitRoomBookingDTO(suitRepository.getReferenceById(id));
    }

    public RoomBookingDTO UpdateDeluxRoomByID(int id){
        return DeluxMapper.DeluxRoomBookingDTO(deluxRepository.getReferenceById(id));
    }
    public RoomBookingDTO UpdateStandardRoomByID(int id){
        return StandardMapper.StandardRoomBookingDTO(standardRepository.getReferenceById(id));
    }
    public RoomBookingDTO UpdateSuitRoomByID(int id){
        return SuitMapper.SuitRoomBookingDTO(suitRepository.getReferenceById(id));
    }

}
