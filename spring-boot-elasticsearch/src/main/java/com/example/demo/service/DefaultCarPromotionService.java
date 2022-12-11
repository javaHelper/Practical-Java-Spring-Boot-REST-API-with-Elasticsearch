package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultCarPromotionService implements CarPromotionService {
	
	@Override
	public boolean isValidPromotionType(String promotionType) {
		return PROMOTION_TYPES.contains(promotionType.toLowerCase());
	}
}
