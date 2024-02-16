package com.example.softwaredemo.demos.web.mapper;


import com.example.softwaredemo.demos.web.pojo.Report;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportMapper {
    @Insert("INSERT INTO report (userId, houseId, type, content) VALUES (#{userId}, #{houseId}, #{type}, #{content})")
    void insertReport(Report report);
}
