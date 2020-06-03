package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity


@DiscriminatorValue("Heavy_Transport")
@Data

public class HeavyTransport extends Car {
    private int carryingCapacity;
}
