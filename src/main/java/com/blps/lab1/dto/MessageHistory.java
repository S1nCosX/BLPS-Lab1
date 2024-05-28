package com.blps.lab1.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "messages_history")
public class MessageHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(name = "message_id")
    private Integer message_id;

    @NotBlank
    @Column(name = "text")
    private String text;

    @NotBlank
    @Column(name = "date_time")
    private String date_time;

    public MessageHistory() {}

    public MessageHistory(Integer message_id, String date_time, String text) {
        this.message_id = message_id;
        this.text = text;
        this.date_time = date_time;
    }
}
