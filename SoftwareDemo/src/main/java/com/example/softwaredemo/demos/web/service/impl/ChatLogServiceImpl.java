package com.example.softwaredemo.demos.web.service.impl;

import com.example.softwaredemo.demos.web.mapper.ChatLogMapper;
import com.example.softwaredemo.demos.web.pojo.ChatLog;
import com.example.softwaredemo.demos.web.service.ChatLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatLogServiceImpl implements ChatLogService {

    private final ChatLogMapper chatLogMapper;

    @Autowired
    public ChatLogServiceImpl(ChatLogMapper chatLogMapper) {
        this.chatLogMapper = chatLogMapper;
    }

    @Override
    public int insertChatLog(ChatLog chatLog) {
        chatLogMapper.insertChatLog(chatLog);
        return 0;
    }

    @Override
    public List<ChatLog> getChatLogByChatId(int chatId) {
        return chatLogMapper.getChatLogByChatId(chatId);
    }

    @Override
    public List<Integer> getChatIdByUserId(int userId) {
        return chatLogMapper.getChatIdByUserId(userId);
    }

    @Override
    public Integer getOtherUser(int chatId, int userId){

        int vari =  chatLogMapper.getOtherUser(chatId, userId);
        return vari;
    }
}
