package com.practical.springframeworkapplication.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "employees" )
public class Employee {
    @Id
    private String id;
    private String name;
    private double wage;
}
