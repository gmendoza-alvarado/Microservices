package com.gonzalomendozafullstack.notification_service.events;

import com.gonzalomendozafullstack.notification_service.model.enums.OrderStatus;

public record OrderEvent(String orderNumber, int itemsCount, OrderStatus orderStatus) {
}

