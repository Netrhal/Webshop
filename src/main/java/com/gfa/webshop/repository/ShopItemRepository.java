package com.gfa.webshop.repository;

import com.gfa.webshop.model.ShopItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@NoArgsConstructor
public class ShopItemRepository {

    private final List<ShopItem> itemList = new ArrayList<>() {{
        add(new ShopItem("Running Shoes", "Shoes for running", 1000, 5));
        add(new ShopItem("Printer", "Puts ink on papper", 3000, 3));
        add(new ShopItem("Coca-cola", "Bubbly drink", 25, 0));
        add(new ShopItem("Teriyaki", "Sweet and saucy chicken", 120, 15));
        add(new ShopItem("T-Shirt", "Funny and stylish", 300, 1));}};

}
