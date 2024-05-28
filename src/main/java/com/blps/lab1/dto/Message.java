package com.blps.lab1.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(name = "user_id")
    private Integer user_id;

    @NotBlank
    @Column(name = "text")
    private String text;

    @NotBlank
    @Column(name = "date_time")
    private String date_time;

    @NotBlank
    @Column(name = "message_owner_user_id")
    private String message_owner_user_id;

    public Message() {}

    public Message(Integer user_id, String text, String date_time) {
        this.user_id = user_id;
        this.text = text;
        this.date_time = date_time;
    }
}
