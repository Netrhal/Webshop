package com.gfa.webshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ShopItem {
    private String name;
    private String description;
    private double price;
    private int quantity;
}
