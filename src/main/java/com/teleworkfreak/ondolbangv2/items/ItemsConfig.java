package com.teleworkfreak.ondolbangv2.items;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class ItemsConfig {
    private final EntityManager em;

    public ItemsConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public ItemsService itemsService(){
        return new ItemsService(itemsRepository());
    }

    @Bean
    public ItemsRepository itemsRepository() {
        return new JPAItemsRepository(em);
    }
}