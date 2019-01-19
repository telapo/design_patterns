/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.composite.models;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;

/**
 * Composite class
 *
 * @author davide
 */
public class ShoppingCenter extends Shop {

    private List<Shop> childShops;

    public ShoppingCenter(String name) {
        super(name);
        childShops = new ArrayList<>();
    }

    @Override
    public String printShopName() {
        return childShops.stream().map(x -> x.getName()).collect(joining(" - "));
    }

    @Override
    public void add(Shop shop) {
        childShops.add(shop);
    }

    @Override
    public void remove(Shop shop) {
        childShops.remove(shop);
    }

    @Override
    public Shop getChild(int index) {
        return childShops.get(index);
    }

}
