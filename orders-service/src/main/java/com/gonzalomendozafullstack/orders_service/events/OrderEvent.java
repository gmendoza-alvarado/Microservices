package com.gonzalomendozafullstack.orders_service.events;

import com.gonzalomendozafullstack.orders_service.model.enums.OrderStatus;

public record OrderEvent(String orderNumber, int itemsCount, OrderStatus orderStatus) {
}
