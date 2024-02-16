package com.example.softwaredemo.demos.web.mapper.provider;

import java.util.Map;

public class HouseInfoProvider {
    public String getHouseInfoByConditions(Map<String, Object> conditions) {
        StringBuilder sql = new StringBuilder("SELECT hi.*, h.houseName FROM HouseInfo hi");
        sql.append(" LEFT JOIN House h ON hi.houseId = h.houseId WHERE 1 = 1");

        if (conditions.containsKey("houseFrom")) {
            sql.append(" AND hi.houseFrom = #{houseFrom}");
        }

        if (conditions.containsKey("houseType")) {
            sql.append(" AND hi.houseType = #{houseType}");
        }
        if (conditions.containsKey("houseSize")) {
            sql.append(" AND hi.houseSize = #{houseSize}");
        }
        if (conditions.containsKey("roomNum")) {
            sql.append(" AND hi.roomNum = #{roomNum}");
        }
        if (conditions.containsKey("minHousePrice")) {
            sql.append(" AND hi.housePrice >= #{minHousePrice}");
        }
        if (conditions.containsKey("maxHousePrice")) {
            sql.append(" AND hi.housePrice <= #{maxHousePrice}");
        }

        return sql.toString();
    }
}


//public class HouseInfoProvider {
//    public String getHouseInfoByConditions(Map<String, Object> conditions) {
//        StringBuilder sql = new StringBuilder("SELECT * FROM HouseInfo WHERE 1 = 1");
//
//        if (conditions.containsKey("houseFrom")) {
//            sql.append(" AND houseFrom = #{houseFrom}");
//        }
//
//        if (conditions.containsKey("houseType")) {
//            sql.append(" AND houseType = #{houseType}");
//        }
//        if (conditions.containsKey("houseSize")) {
//            sql.append(" AND houseSize = #{houseSize}");
//        }
//        if (conditions.containsKey("roomNum")) {
//            sql.append(" AND roomNum = #{roomNum}");
//        }
//        if (conditions.containsKey("minHousePrice")) {
//            sql.append(" AND housePrice >= #{housePrice}");
//        }
//        if (conditions.containsKey("maxHousePrice")) {
//            sql.append(" AND housePrice <= #{housePrice}");
//        }
//
//        return sql.toString();
//    }
//}
