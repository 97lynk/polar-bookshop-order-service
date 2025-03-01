package com.polarbookshop.orderservice.order.domain;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Table(name = "orders")
public record Order(
        @Id
        Long id,
        String bookIsbn,
        String bookName,
        Double bookPrice,
        Integer quantity,
        OrderStatus status,
        @CreatedBy
        String createdBy,
        @LastModifiedBy
        String lastModifiedBy,
        @CreatedDate
        Instant createdDate,
        @LastModifiedDate
        Instant lastModifiedDate,
        @Version
        int version
) {

    public static Order of(
            String bookIsbn, String bookName, Double bookPrice,
            Integer quantity, OrderStatus status
    ) {
        return new Order(
                null, bookIsbn, bookName, bookPrice, quantity, status, null, null, null, null, 0
        );
    }
}
