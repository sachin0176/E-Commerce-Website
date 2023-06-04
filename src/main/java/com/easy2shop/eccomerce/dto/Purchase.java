package com.easy2shop.eccomerce.dto;


import com.easy2shop.eccomerce.entity.Address;
import com.easy2shop.eccomerce.entity.Customer;
import com.easy2shop.eccomerce.entity.Order;
import com.easy2shop.eccomerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
