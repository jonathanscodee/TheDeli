package com.yearup.services.interfaces;

import com.yearup.models.Order;

public interface OrderService {
    double calculateTotal(Order order);
    void checkout(Order order);
    String orderFormatter(Order order);
}
