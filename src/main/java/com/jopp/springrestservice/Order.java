package com.jopp.springrestservice;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "CUSTOMER_ORDER")
class Order {

    Order(){}

    @Id @GeneratedValue private Long id;

    private String description;
    private Status status;

    Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }
}
