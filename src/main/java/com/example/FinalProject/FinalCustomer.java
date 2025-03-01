package com.example.FinalProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data

public class FinalCustomer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected FinalCustomer() {}

    public FinalCustomer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

}

    }
