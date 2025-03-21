package com.example.chitchat.model;

import com.example.chitchat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Transactional
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }
}
