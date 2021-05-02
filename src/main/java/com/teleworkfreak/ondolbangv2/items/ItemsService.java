package com.teleworkfreak.ondolbangv2.items;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
public class ItemsService {
    private ItemsRepository itemsRepository;

    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Items> findAll(){
        return itemsRepository.findAll();
    }
}
