package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

import com.example.demo.model.PostDetails;

@Data
@Entity


public class PostDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String forWho;

    @OneToOne
    @JoinColumn(name = "post_id")

    private Post post;

}
