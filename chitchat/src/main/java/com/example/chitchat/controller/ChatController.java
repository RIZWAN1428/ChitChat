package com.example.chitchat.controller;

import com.example.chitchat.model.Message;
import com.example.chitchat.model.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat1")
    @SendTo("/topic/chat1")
    public Message sendToChat1(Message message) {
        return message;
    }

    @MessageMapping("/chat2")
    @SendTo("/topic/chat2")
    public Message sendToChat2(Message message) {
        return message;
    }
}

