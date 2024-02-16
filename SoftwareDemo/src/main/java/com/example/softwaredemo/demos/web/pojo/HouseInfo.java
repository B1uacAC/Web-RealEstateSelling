package com.example.softwaredemo.demos.web.pojo;

import java.sql.Timestamp;

public class HouseInfo {
    private int houseId;

    private String houseName;
    private float houseSize;
    private String houseFrom;
    private String houseType;
    private int roomNum;
    private Timestamp uploadTime;

    private float housePrice;

    public HouseInfo() {
    }

    public String getHouseName() {
        return houseName;
    }
    public void setHouseName(String name){
        this.houseName = name;
    }
    // 省略构造函数和其他方法

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public float getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(float houseSize) {
        this.houseSize = houseSize;
    }

    public String getHouseFrom() {
        return houseFrom;
    }

    public void setHouseFrom(String houseFrom) {
        this.houseFrom = houseFrom;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    public float getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(float housePrice) {
        this.housePrice = housePrice;
    }
}
