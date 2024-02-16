package com.example.softwaredemo.demos.web.pojo;

public class Report {
    private int userId;
    private int houseId;
    private String type;
    private String content;

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
    public String getType(){
        return  this.type;
    }
    public String getContent(){
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }
}
