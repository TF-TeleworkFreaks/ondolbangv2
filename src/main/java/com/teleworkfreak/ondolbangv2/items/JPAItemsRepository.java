package com.teleworkfreak.ondolbangv2.items;

import javax.persistence.EntityManager;
import java.util.List;

public class JPAItemsRepository implements ItemsRepository {

    private final EntityManager em;

    public JPAItemsRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Items> findAll() {
        return em.createQuery("select item from Items item", Items.class)
                .getResultList();
    }
}
