package com.example.softwaredemo.demos.web.service;

import com.example.softwaredemo.demos.web.pojo.ChatLog;

import java.util.List;

public interface ChatLogService {

    int insertChatLog(ChatLog chatLog);
    Integer getOtherUser(int chatId, int userId);

    List<ChatLog> getChatLogByChatId(int chatId);

    List<Integer> getChatIdByUserId(int userId);
}
