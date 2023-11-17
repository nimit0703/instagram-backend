package com.instagram.instagram.chat.oneToOne.controller;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.instagram.instagram.chat.oneToOne.classes.Message;

@Controller
public class ChatController {

    @MessageMapping("/chat/{userId}")
    @SendTo("/topic/messages/{userId}")
    public Message sendMessage(@DestinationVariable String userId, Message message) {
        return message;
    }
}
