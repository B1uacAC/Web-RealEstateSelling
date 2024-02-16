package com.example.softwaredemo.demos.web.service.impl;

import com.example.softwaredemo.demos.web.mapper.HouseMapper;
import com.example.softwaredemo.demos.web.pojo.House;
import com.example.softwaredemo.demos.web.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;

    @Override
    public House getHouseById(int houseId) {
        return houseMapper.getHouseById(houseId);
    }

    @Override
    public void addHouse(House house) {
        houseMapper.insertHouse(house);
    }

    @Override
    public void updateHouse(House house) {
        houseMapper.updateHouse(house);
    }

    @Override
    public void deleteHouse(int houseId) {
        houseMapper.deleteHouse(houseId);
    }

    @Override
    public List<House> getAllHouse() {
        return houseMapper.getAllHouse();
    }
}
