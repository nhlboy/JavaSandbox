package com.example.demo.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class TruckingCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOnTheDoor;

    @OneToOne
    @JoinColumn(name ="truck_id")
    private Truck truck;
}
