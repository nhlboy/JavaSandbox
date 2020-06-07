package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String text;

    // PostDetails владеет Post'ом
    @OneToOne(mappedBy = "post", cascade =  CascadeType.ALL)
    @JsonIgnore

    private PostDetails postDetails;

}
