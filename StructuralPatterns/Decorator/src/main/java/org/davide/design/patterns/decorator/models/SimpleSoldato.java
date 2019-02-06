/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.decorator.models;

/**
 * Example of ConcreteComponent.
 * 
 * @author davide
 */
public class SimpleSoldato implements Soldato{
    
    @Override
    public void attack() {
        System.out.println("I am using a gun");
    }

    @Override
    public int getStrengthOfAttack() {
        return 10;
    }

    @Override
    public void withdraw() {
        System.out.println("I am going away");
    }
    
}
