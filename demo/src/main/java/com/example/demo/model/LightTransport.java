package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity

@Data
@DiscriminatorValue("Light_Transport")

public class LightTransport extends Car {
    private int passengerCapacity;
}
