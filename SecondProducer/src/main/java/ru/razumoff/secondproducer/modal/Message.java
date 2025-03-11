package ru.razumoff.secondproducer.modal;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message implements Serializable {
    private String sender;
    private String content;
    private String timestamp;
}
