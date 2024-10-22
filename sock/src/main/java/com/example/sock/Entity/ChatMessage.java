package com.example.sock.Entity;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatMessage {
    private String content;
    private String sender;
//    private MessageType type;

    public enum MessageType {
        CHAT, LEAVE, JOIN
    }
}
