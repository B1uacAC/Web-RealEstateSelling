package com.example.softwaredemo.demos.web.mapper;

import com.example.softwaredemo.demos.web.pojo.House;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface HouseMapper {
    @Select("SELECT * FROM House WHERE houseId = #{houseId}")
    House getHouseById(int houseId);

    @Insert("INSERT INTO House (houseId, houseName, houseLocationX, houseLocationY) VALUES (#{houseId}, #{houseName}, #{houseLocationX}, #{houseLocationY})")
    void insertHouse(House house);

    @Update("UPDATE House SET houseName = #{houseName}, houseLocationX = #{houseLocationX}, houseLocationY = #{houseLocationY} WHERE houseId = #{houseId}")
    void updateHouse(House house);

    @Delete("DELETE FROM House WHERE houseId = #{houseId}")
    void deleteHouse(int houseId);
    @Select("select * from House where houseId not in (select house_id from trade_offer)")
    List<House> getAllHouse();
}
