/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.composite.models;

/**
 * This is the component.
 *
 * @author davide
 */
public abstract class Shop {

    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public abstract String printShopName();

    public void add(Shop shop) {
    }

    public void remove(Shop shop) {
    }

    public Shop getChild(int index) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
