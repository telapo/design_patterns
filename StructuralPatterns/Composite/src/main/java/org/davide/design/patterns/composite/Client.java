/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.composite;

import org.davide.design.patterns.composite.models.Drugstore;
import org.davide.design.patterns.composite.models.Shop;
import org.davide.design.patterns.composite.models.ShoppingCenter;

/**
 *
 * @author davide
 */
public class Client {
    public static void main(String[] args) {
        Shop drugStore = new Drugstore("Super Drugstore");
        System.out.println("First shop: " + drugStore.printShopName());
        Shop butcher = new Drugstore("The Real Butcher");
        System.out.println("Second shop: " + butcher.printShopName());
        Shop shoppingCenter = new ShoppingCenter("Big Mall");
        System.out.println("Mall: " + shoppingCenter.printShopName());
        shoppingCenter.add(butcher);
        shoppingCenter.add(drugStore);
        System.out.println("Mall: " + shoppingCenter.printShopName());
        shoppingCenter.remove(butcher);
        System.out.println("Mall: " + shoppingCenter.printShopName());
    }
}
