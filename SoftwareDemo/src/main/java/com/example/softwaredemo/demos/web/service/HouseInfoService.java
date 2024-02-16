package com.example.softwaredemo.demos.web.service;

import com.example.softwaredemo.demos.web.pojo.House;
import com.example.softwaredemo.demos.web.pojo.HouseInfo;

import java.util.List;
import java.util.Map;

public interface HouseInfoService {
    HouseInfo getHouseInfoById(int houseId);

    void insertHouseInfo(HouseInfo houseInfo);

    void updateHouseInfo(HouseInfo houseInfo);

    void deleteHouseInfo(int houseId);

    List<HouseInfo> getHouseInfoByConditions(Map<String, Object> conditions);
}
