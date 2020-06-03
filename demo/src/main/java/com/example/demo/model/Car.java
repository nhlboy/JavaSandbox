package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "cars")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "Car_Type")

public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String model;

}
