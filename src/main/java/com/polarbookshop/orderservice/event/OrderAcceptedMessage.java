package com.polarbookshop.orderservice.event;

public record OrderAcceptedMessage(
        Long orderId
) {
}
