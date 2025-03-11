package ru.razumoff.kafkawebsocketsample.modal;

import lombok.Data;

@Data
public class Message {
    private String sender;
    private String content;
    private String timestamp;
}
