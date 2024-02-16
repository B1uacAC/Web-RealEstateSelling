package com.example.softwaredemo.demos.web.service.impl;

import com.example.softwaredemo.demos.web.mapper.HouseInfoMapper;
import com.example.softwaredemo.demos.web.pojo.HouseInfo;
import com.example.softwaredemo.demos.web.service.HouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HouseInfoServiceImpl implements HouseInfoService {
    @Autowired
    private HouseInfoMapper houseInfoMapper;

    @Override
    public HouseInfo getHouseInfoById(int houseId) {
        return houseInfoMapper.getHouseInfoById(houseId);
    }

    @Override
    public void insertHouseInfo(HouseInfo houseInfo) {
        houseInfoMapper.insertHouseInfo(houseInfo);
    }

    @Override
    public void updateHouseInfo(HouseInfo houseInfo) {
        houseInfoMapper.updateHouseInfo(houseInfo);
    }

    @Override
    public void deleteHouseInfo(int houseId) {
        houseInfoMapper.deleteHouseInfo(houseId);
    }

    @Override
    public List<HouseInfo> getHouseInfoByConditions(Map<String, Object> conditions) {
        return houseInfoMapper.getHouseInfoByConditions(conditions);
    }
}
