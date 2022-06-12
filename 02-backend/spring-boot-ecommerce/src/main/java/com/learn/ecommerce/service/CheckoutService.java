package com.learn.ecommerce.service;

import com.learn.ecommerce.dto.Purchase;
import com.learn.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
	
	PurchaseResponse placeOrder(Purchase purchase);
}
