package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.entity.CarPromotion;

public interface CarPromotionElasticRepository extends ElasticsearchRepository<CarPromotion, String>{
	Page<CarPromotion> findByType(String type, Pageable pageable);
}