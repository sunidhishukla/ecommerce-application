package com.learn.ecommerce.dto;

import java.util.Set;

import com.learn.ecommerce.entity.Address;
import com.learn.ecommerce.entity.Customer;
import com.learn.ecommerce.entity.Order;
import com.learn.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {

	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
}
