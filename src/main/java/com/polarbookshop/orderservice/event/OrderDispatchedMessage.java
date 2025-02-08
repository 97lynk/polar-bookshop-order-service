package com.polarbookshop.orderservice.event;

public record OrderDispatchedMessage(
        Long orderId
) {
}
