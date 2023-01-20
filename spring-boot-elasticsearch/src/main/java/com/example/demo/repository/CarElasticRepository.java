package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.entity.Car;

public interface CarElasticRepository extends ElasticsearchRepository<Car, String>{
	Page<Car> findByBrandAndColor(String brand, String color, Pageable pageable);
	List<Car> findByFirstReleaseDateAfter(LocalDate date);
}