package com.gfa.webshop.service;

import com.gfa.webshop.model.ShopItem;
import com.gfa.webshop.repository.ShopItemRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
public class ItemServiceImpl implements ItemService{
    ShopItemRepository shopItemRepository;

    @Autowired
    public void setShopItemRepository(ShopItemRepository shopItemRepository) {
        this.shopItemRepository = shopItemRepository;
    }

    @Override
    public List<ShopItem> getItems() {
        return shopItemRepository.getItemList();
    }
}
