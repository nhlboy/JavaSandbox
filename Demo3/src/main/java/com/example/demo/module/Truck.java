package com.example.demo.module;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String unitMake;

    @OneToOne(mappedBy = "truck")
    @JsonIgnore
    private TruckingCompany truckingCompany;

}
