package com.bic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_TBL")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String customerName;

    @Column(nullable = false, columnDefinition = "varchar(200)")
    private String customerAddress;

    @Column(nullable = false, columnDefinition = "varchar(7)")
    private String customerPinCode;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String contactName1;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String contactName2;

    @Column(nullable = false, columnDefinition = "varchar(10)")
    private String contactNumber1;

    @Column(nullable = false, columnDefinition = "varchar(10)")
    private String contactNumber2;
}
