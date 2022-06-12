package com.learn.ecommerce.dto;

import lombok.Data;

@Data              // lombok @Data generates constructor for final fields
public class PurchaseResponse {
	
	private final String orderTrackingNumber;           // reason for making it final is commented on line 5.
	
	// alternate way would be to use @NonNull annotation instead of making field final as shown in the comments below.
	
//	 @NonNull
//	 private String orderTrackingNumber;
}
