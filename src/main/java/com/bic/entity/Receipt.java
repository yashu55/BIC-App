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
@Table(name = "RECEIPT_TBL")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int receiptId;

    @Column(columnDefinition = "varchar(2)", nullable = false)
    private String receiptType;

    @Column(columnDefinition = "varchar(10)", nullable = false)
    private String dateTime;

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId", nullable = false)
    private Customer customer;

    @Column(columnDefinition = "varchar(30)", nullable = false)
    private String vehicleNo;

    @Column(columnDefinition = "varchar(30)", nullable = false)
    private String deliveryPersonName;

    @Column(columnDefinition = "varchar(10)", nullable = false)
    private String deliveryPersonContact;

    @Column(columnDefinition = "varchar(500)", nullable = false)
    private String allCylinders;
}
