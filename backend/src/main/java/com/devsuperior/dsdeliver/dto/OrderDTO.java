package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.entities.OrderStatus;

import java.time.Instant;

public class OrderDTO {

    private Long id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;
}
