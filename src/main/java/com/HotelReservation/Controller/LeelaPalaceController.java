package com.HotelReservation.Controller;

import com.HotelReservation.DTO.RoomBookingDTO;
import com.HotelReservation.Service.LeelaPalaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LeelaPalaceController {
    @Autowired
    private LeelaPalaceService service;

//In ResponseEntity.ok "ok" is the 200k(status code) sign that means Success Response
    @PostMapping("/DeluxRoomBooking")
    public ResponseEntity<RoomBookingDTO> DeluxRoomBooking(@RequestBody RoomBookingDTO roomBookingDTO){
         return ResponseEntity.ok(service.DeluxRoomBooking(roomBookingDTO));
    }

    @PostMapping("/StandardRoomBooking")
    public ResponseEntity<RoomBookingDTO> StandardRoomBooking(@RequestBody RoomBookingDTO roomBookingDTO){
        return ResponseEntity.ok(service.StandardRoomBooking(roomBookingDTO));
    }

    @PostMapping("/SuitRoomBooking")
    public ResponseEntity<RoomBookingDTO> SuitRoomBooking(@RequestBody RoomBookingDTO roomBookingDTO){
        return ResponseEntity.ok(service.SuitRoomBooking(roomBookingDTO));
    }
    @GetMapping("/GetDeluxRoom")
    public ResponseEntity<RoomBookingDTO> GetDeluxRoomByID(@RequestParam("id") int id){
        return ResponseEntity.ok(service.GetDeluxRoomByID(id));
    }
    @GetMapping("/GetStandardRoom")
    public ResponseEntity<RoomBookingDTO> GetStandardRoomByID(@RequestParam("id") int id){
        return ResponseEntity.ok(service.GetStandardRoomByID(id));
    }
    @GetMapping("/GetSuitRoom")
    public ResponseEntity<RoomBookingDTO> GetSuitRoomByID(@RequestParam("id") int id){
        return ResponseEntity.ok(service.GetSuitRoomByID(id));
    }
    @DeleteMapping("/DeleteDeluxRoom")
    public ResponseEntity<RoomBookingDTO> DeleteDeluxRoomByID(@RequestParam("id") int id){
        return ResponseEntity.ok(service.DeleteDeluxRoomByID(id));
    }
    @DeleteMapping("/DeleteStandardRoom")
    public ResponseEntity<RoomBookingDTO> DeleteStandardRoomByID(@RequestParam("id")int id){
        return ResponseEntity.ok(service.DeleteStandardRoomByID(id));
    }
    @DeleteMapping("/DeleteSuitRoom")
    public ResponseEntity<RoomBookingDTO> DeleteSuitRoomByID(@RequestParam("id") int id){
        return ResponseEntity.ok(service.DeleteSuitRoomByID(id));
    }
    @PutMapping("/UpdateDeluxRoom")
    public ResponseEntity<RoomBookingDTO> UpdateDeluxRoomByID(@RequestParam("id") int id){
        return ResponseEntity.ok(service.UpdateDeluxRoomByID(id));
    }
    @PutMapping("/UpdateStandardRoom")
    public ResponseEntity<RoomBookingDTO> UpdateStandardRoomByID(@RequestParam("id")int id){
        return ResponseEntity.ok(service.UpdateStandardRoomByID(id));
    }
    @PutMapping("/UpdateStandardRoom")
    public ResponseEntity<RoomBookingDTO> UpdateSuitRoomByID(@RequestParam("id") int id){
        return ResponseEntity.ok(service.UpdateSuitRoomByID(id));
    }


}
