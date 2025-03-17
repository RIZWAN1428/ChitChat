package com.example.chitchat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "messages") // This creates the 'messages' table
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Add this field for database ID

    private String sender;
    private String content;
    private String type; // "JOIN", "CHAT", "LEAVE"

    public Message() {}

    public Message(String sender, String content, String type) {
        this.sender = sender;
        this.content = content;
        this.type = type;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
