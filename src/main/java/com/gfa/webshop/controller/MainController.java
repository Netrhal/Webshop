package com.gfa.webshop.controller;

import com.gfa.webshop.model.ShopItem;
import com.gfa.webshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Controller
public class MainController {
    ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping({"/webshop", "/"})
    public String getWebshop(@RequestParam(name="name", required = false) String name, Model model) {
        List<ShopItem> itemList = itemService.getItems();
        if (Objects.nonNull(name)) {
            itemList = itemList.stream()
                    .filter(x -> x.getName().toLowerCase().contains(name.toLowerCase()))
                    .toList();
        }
        model.addAttribute("itemList", itemList);
        return "webshop";
    }
    @GetMapping("/only-available")
    public String getOnlyNonZero(Model model) {
        List<ShopItem> itemList = itemService.getItems();
        itemList = itemList.stream()
                .filter(x -> x.getQuantity() != 0)
                .toList();
        model.addAttribute("itemList", itemList);
        return "webshop";
    }
    @GetMapping("/cheapest-first")
    public String getSortedByPrice(Model model) {
        List<ShopItem> itemList = itemService.getItems();
        itemList = itemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .toList();
        model.addAttribute("itemList", itemList);
        return "webshop";
    }
}
