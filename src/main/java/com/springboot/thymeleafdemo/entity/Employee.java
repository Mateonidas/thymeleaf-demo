package com.springboot.thymeleafdemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "firm")
    private String firm;

    public Employee() {
    }

    public Employee(String lastName, Double salary, String firm) {
        this.lastName = lastName;
        this.salary = salary;
        this.firm = firm;
    }

    public Employee(int id, String lastName, Double salary, String firm) {
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;
        this.firm = firm;
    }
}
