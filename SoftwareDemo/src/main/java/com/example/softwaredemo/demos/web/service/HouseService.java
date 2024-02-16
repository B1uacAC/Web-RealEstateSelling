package com.example.softwaredemo.demos.web.service;

import com.example.softwaredemo.demos.web.pojo.House;

import java.util.List;

public interface HouseService {
    House getHouseById(int houseId);
    void addHouse(House house);
    void updateHouse(House house);
    void deleteHouse(int houseId);

    List<House> getAllHouse();
}
