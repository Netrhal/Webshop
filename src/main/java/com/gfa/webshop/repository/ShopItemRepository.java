package com.gfa.webshop.repository;

import com.gfa.webshop.model.ShopItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShopItemRepository {
    private final List<ShopItem> itemList = new ArrayList<>() {{
        itemList.add(new ShopItem("Running Shoes", "Shoes for running", 1000, 5));
        itemList.add(new ShopItem("Printer", "Puts ink on papper", 3000, 3));
        itemList.add(new ShopItem("Coca-cola", "Bubbly drink", 25, 100));
        itemList.add(new ShopItem("Teriyak", "Sweet and saucy chicken", 120, 15));
        itemList.add(new ShopItem("T-Shirt", "Funny and stylish", 300, 1));}};
    public List<ShopItem> getItems() {
        return itemList;
    }
}
