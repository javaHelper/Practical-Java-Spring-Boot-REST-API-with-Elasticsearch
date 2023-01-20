package com.example.demo.api.server;

import com.example.demo.entity.CarPromotion;
import com.example.demo.repository.CarPromotionElasticRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CarPromotionElasticDS {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarPromotionElasticDS.class);

    @Autowired
    private CarPromotionElasticRepository repository;

    @EventListener(ApplicationReadyEvent.class)
    public void populateData() {
        repository.findAll();

        CarPromotion promotion1 = new CarPromotion("bonus", "Purchase in cash and get free luxury dinner");
        CarPromotion promotion2 = new CarPromotion("bonus", "Purchase luxury car and get free trip Japan");
        CarPromotion promotion3 = new CarPromotion("bonus", "Purchase two cars and get 20g of gold");
        CarPromotion promotion4 = new CarPromotion("discount", "Purchase in cash and get 1% discount");
        CarPromotion promotion5 = new CarPromotion("discount", "Purchase before end of month to get 1.5% discount");
        CarPromotion promotion6 = new CarPromotion("discount", "Today only! We gives 0.5% additional discount");

        repository.saveAll(Arrays.asList(promotion1, promotion2, promotion3, promotion4, promotion5, promotion6));

        LOGGER.info("Saved dummy promotion data : {}", repository.count());
    }
}