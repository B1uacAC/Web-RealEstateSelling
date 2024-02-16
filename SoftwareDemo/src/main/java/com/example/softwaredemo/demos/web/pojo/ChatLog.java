package com.example.softwaredemo.demos.web.pojo;

import java.sql.Timestamp;

public class ChatLog {
    private int chatId;
    private int userA;
    private int userB;
    private String content;
    private Timestamp sentTime;
    private int houseId;

    // Constructors, getters, setters...

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getUserA() {
        return userA;
    }

    public void setUserA(int userA) {
        this.userA = userA;
    }

    public int getUserB() {
        return userB;
    }

    public void setUserB(int userB) {
        this.userB = userB;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getSentTime() {
        return sentTime;
    }

    public void setSentTime(Timestamp sentTime) {
        this.sentTime = sentTime;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }
}
