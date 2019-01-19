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
public class Drugstore extends Shop {

    public Drugstore(String name) {
        super(name);
    }

    @Override
    public String printShopName() {
        return this.getName();
    }

}
