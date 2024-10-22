package com.example.sock.Controller;

import com.example.sock.Entity.ChatMessage;
import com.example.sock.Entity.Greeting;
import com.example.sock.Entity.HelloMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

@Service
public class ChatController {

//    private static final Logger logger = (Logger) LoggerFactory.getLogger(ChatMessage.class);
//private static final Logger logger = LoggerFactory.getLogger(ChatMessage.class);


//    @MessageMapping("/app")
//    @SendTo("/topic/public")
//    public ChatMessage register( ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
//        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
//        return chatMessage;
//    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

    @MessageMapping("/application")
    @SendTo("/all/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
//        logger.info("Received message: {}", chatMessage.getContent());
        return chatMessage;
    }
}
