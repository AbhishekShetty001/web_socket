package com.abhishek.chat.controller;

import com.abhishek.chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ChatController {

    //send here whatever you wamt to send
    @MessageMapping("/sendMessage")
    //will displayed and you have subscribed to here
    @SendTo("/topic/messages")
     public ChatMessage sendmsg(ChatMessage msg){
         return msg;
     }

     @GetMapping("/chat")
    public String chat(){
        return "chat";
     }
}
