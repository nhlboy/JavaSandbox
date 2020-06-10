package com.example.demo.module;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int cdl;

    @ManyToOne
    @JoinColumn(name = "truck_id")
    private Truck truck;
}
