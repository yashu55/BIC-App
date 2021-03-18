package com.bic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cylinder_TBL")
public class Cylinder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cylinderId;

    @ManyToOne
    @JoinColumn(name = "gasId", referencedColumnName = "gasId", nullable = false)
    private Gas gas;

    @Column(columnDefinition = "float(5,2)", nullable = false)
    private double cylinderCapacity;

    @Column(columnDefinition = "varchar(3)", nullable = false)
    private String cylinderUnit;
}
