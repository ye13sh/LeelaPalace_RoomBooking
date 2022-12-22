package com.HotelReservation.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SuitRoom")
public class SuitRoomBookingEntity {
    @Id//Id anotation is used to consider roomNo as ID and as a reference to auto generate id/roomNo
    //@GeneratedValue(strategy = GenerationType.AUTO)//GeneratedValue anotation is used to auto generate id or if you want to give it manually then remove it
    @Column(name = "Room_No")//Column anotation is used because in MySQL table we need name to be separated
    private int roomNo;
    private String name;
    private String age;
    private String dOB;
    private String contact;
    @Column(name = "Place_Of_Origin")//Column anotation is used because in MySQL table we need name to be separated
    private String placeOfOrigin;

    @Column(name = "Room_Type")
    private String roomType;

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "SuitRoomBookingEntity{" +
                "roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dOB='" + dOB + '\'' +
                ", contact='" + contact + '\'' +
                ", placeOfOrigin='" + placeOfOrigin + '\'' +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
