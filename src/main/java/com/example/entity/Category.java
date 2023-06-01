package com.example.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Category")
public class Category {
    @Basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    private Long topicality;
}
