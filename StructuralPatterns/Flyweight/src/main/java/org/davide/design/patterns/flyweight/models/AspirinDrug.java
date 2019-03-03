/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.flyweight.models;

/**
 * This is a concrete Flyweight implementation.
 * 
 * @author davide
 */
public class AspirinDrug implements Drug {

    @Override
    public void takeDrug() {
        System.out.println("I am taking aspirin");
    }

}
