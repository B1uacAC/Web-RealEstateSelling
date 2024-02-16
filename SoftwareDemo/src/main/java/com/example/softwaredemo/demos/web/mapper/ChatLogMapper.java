package com.example.softwaredemo.demos.web.mapper;

import com.example.softwaredemo.demos.web.pojo.ChatLog;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ChatLogMapper {

    @Insert("INSERT INTO ChatLog (chatId, UserA, UserB, content, houseId) " +
            "VALUES (#{chatId}, #{userA}, #{userB}, #{content}, #{houseId})")
    void insertChatLog(ChatLog chatLog);


    @Select("SELECT * FROM ChatLog WHERE chatId = #{chatId}")
    List<ChatLog> getChatLogByChatId(int chatId);

    @Select("SELECT DISTINCT CASE WHEN UserA != #{userId} THEN UserA ELSE UserB END AS otherUserId " +
            "FROM ChatLog " +
            "WHERE chatId = #{chatId}")
    Integer getOtherUser(@Param("chatId") int chatId, @Param("userId") int userId);


    @Select("SELECT chatId FROM ChatLog WHERE UserA = #{userId} OR UserB = #{userId} ")
    List<Integer> getChatIdByUserId(int userId);
}
