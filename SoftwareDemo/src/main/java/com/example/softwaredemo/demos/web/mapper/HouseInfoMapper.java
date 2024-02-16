package com.example.softwaredemo.demos.web.mapper;

import com.example.softwaredemo.demos.web.mapper.provider.HouseInfoProvider;
import com.example.softwaredemo.demos.web.pojo.HouseInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface HouseInfoMapper {
    @Select("SELECT * FROM HouseInfo WHERE houseId = #{houseId}")
    HouseInfo getHouseInfoById(int houseId);

    @Insert("INSERT INTO HouseInfo (houseSize, houseFrom, houseType, roomNum, uploadTime) " +
            "VALUES (#{houseSize}, #{houseFrom}, #{houseType}, #{roomNum}, #{uploadTime})")
    void insertHouseInfo(HouseInfo houseInfo);

    @Update("UPDATE HouseInfo SET houseSize = #{houseSize}, houseFrom = #{houseFrom}, " +
            "houseType = #{houseType}, roomNum = #{roomNum}, uploadTime = #{uploadTime} " +
            "WHERE houseId = #{houseId}")
    void updateHouseInfo(HouseInfo houseInfo);

    @Delete("DELETE FROM HouseInfo WHERE houseId = #{houseId}")
    void deleteHouseInfo(int houseId);

    @SelectProvider(type = HouseInfoProvider.class, method = "getHouseInfoByConditions")
    List<HouseInfo> getHouseInfoByConditions(Map<String, Object> conditions);
}
