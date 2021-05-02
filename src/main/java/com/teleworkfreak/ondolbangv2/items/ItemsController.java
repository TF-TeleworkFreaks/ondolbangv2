package com.teleworkfreak.ondolbangv2.items;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemsController {

    private ItemsService itemsService;

    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }
    @GetMapping("/")
    @ResponseBody
    public List<Items> search(){
        List<Items> findData = itemsService.findAll();
        return findData;
    }
}