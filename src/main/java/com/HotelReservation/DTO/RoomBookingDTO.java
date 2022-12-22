package com.HotelReservation.DTO;

public class RoomBookingDTO {
    private int roomNo;
    private String name;
    private String age;
    private String dOB;
    private String contact;
    private String placeOfOrigin;
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
        return "RoomBookingDTO{" +
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
