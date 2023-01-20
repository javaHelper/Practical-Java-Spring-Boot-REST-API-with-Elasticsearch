package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(indexName = "practical-java-2")
public class CarPromotion {
	@Id
	private String id;
	private String type;
	private String description;

	public CarPromotion(String type, String description) {
		this.type = type;
		this.description = description;
	}
}