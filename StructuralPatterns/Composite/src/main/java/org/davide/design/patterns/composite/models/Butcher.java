/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.composite.models;

/**
 * Leaf
 *
 * @author davide
 */
public class Butcher extends Shop {

    public Butcher(String name) {
        super(name);
    }

    @Override
    public String printShopName() {
        return this.getName();
    }

}
