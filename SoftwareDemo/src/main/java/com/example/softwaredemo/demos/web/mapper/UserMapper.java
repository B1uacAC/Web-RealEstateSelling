package com.example.softwaredemo.demos.web.mapper;

import com.example.softwaredemo.demos.web.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM User WHERE user_id = #{userId}")
    User getUserById(int userId);

    @Insert("INSERT INTO User (user_id, username, passwd) VALUES (#{userId}, #{username}, #{passwd})")
    void insertUser(User user);

    @Update("UPDATE User SET username = #{username}, passwd = #{passwd} WHERE user_id = #{userId}")
    void updateUser(User user);

    @Delete("DELETE FROM User WHERE user_id = #{userId}")
    void deleteUser(int userId);
}
