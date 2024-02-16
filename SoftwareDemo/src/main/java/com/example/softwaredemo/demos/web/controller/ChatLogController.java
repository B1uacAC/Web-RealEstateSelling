package com.example.softwaredemo.demos.web.controller;

import com.example.softwaredemo.demos.web.pojo.ChatLog;
import com.example.softwaredemo.demos.web.service.ChatLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/chat")
public class ChatLogController {

    private final ChatLogService chatLogService;

    @Autowired
    public ChatLogController(ChatLogService chatLogService) {
        this.chatLogService = chatLogService;
    }

    @PostMapping("/insert")
    public ResponseEntity<String> insertChatLog(@RequestParam int chatId,
                                                @RequestParam int userA,
                                                @RequestParam int userB,
                                                @RequestParam String content,
                                                @RequestParam int houseId) {
        ChatLog chatLog = new ChatLog();
        chatLog.setChatId(chatId);
        System.out.println(chatId);
        chatLog.setUserA(userA);
        chatLog.setUserB(userB);
        chatLog.setContent(content);
        chatLog.setHouseId(houseId);

        int rowsInserted = chatLogService.insertChatLog(chatLog);
        System.out.println(rowsInserted);

        if (rowsInserted >= 0) {
            // 插入成功，返回成功的响应
            return ResponseEntity.ok("success");
        } else {
            // 插入失败，返回适当的错误响应
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert chat log");
        }
    }


    @GetMapping("/getChatLog/{chatId}")
    public List<ChatLog> getChatLogByChatId(@PathVariable int chatId) {
        return chatLogService.getChatLogByChatId(chatId);
    }

    @GetMapping("/getChatId/{userId}")
    public List<Integer> getChatIdByUserId(@PathVariable int userId) {
        return chatLogService.getChatIdByUserId(userId);
    }

    @GetMapping("/getOtherUserId/{chatId}/{userId}")
    public int getOtherUserId(@PathVariable int chatId, @PathVariable int userId) {
        int otherUserId = chatLogService.getOtherUser(chatId, userId);
        return otherUserId;
    }
}
