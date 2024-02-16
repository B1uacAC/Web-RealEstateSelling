package com.example.softwaredemo.demos.web.pojo;

public class House {

    private int houseId;
    private String houseName;
    private float houseLocationX;
    private float houseLocationY;
    private int userId;
    public int getUserId(){
        return this.userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    // Getters and setters
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public float getHouseLocationX() {
        return houseLocationX;
    }

    public void setHouseLocationX(float houseLocationX) {
        this.houseLocationX = houseLocationX;
    }

    public float getHouseLocationY() {
        return houseLocationY;
    }

    public void setHouseLocationY(float houseLocationY) {
        this.houseLocationY = houseLocationY;
    }
}
