package com.blps.lab1.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "black_list")
public class BlackList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(name = "user_id")
    private Integer user_id;

    public BlackList() {}

    public BlackList(Integer user_id) {
        this.user_id = user_id;
    }
}
