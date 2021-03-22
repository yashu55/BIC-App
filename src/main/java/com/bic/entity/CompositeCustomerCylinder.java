package com.bic.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CompositeCustomerCylinder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Customer customer;
    private Cylinder cylinder;
}
