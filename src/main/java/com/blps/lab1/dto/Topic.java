package com.blps.lab1.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "topics")
public class Topic {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "topic_headline")
    private String topic_headline;

    public Topic() {}

    public Topic(String topic_headline) {
        this.topic_headline = topic_headline;
    }
}
