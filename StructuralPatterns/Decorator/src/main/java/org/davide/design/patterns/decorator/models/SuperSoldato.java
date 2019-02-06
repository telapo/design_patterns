/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.decorator.models;

/**
 * Decorator object, which keeps a reference to the Component and adds behavior.
 * 
 * @author davide
 */
public class SuperSoldato implements Soldato {

    private Soldato soldato;

    public SuperSoldato(Soldato soldato) {
        this.soldato = soldato;
    }

    @Override
    public void attack() {
        soldato.attack();
        System.out.println("I am using a couple of bombs!");
    }

    @Override
    public int getStrengthOfAttack() {
        return soldato.getStrengthOfAttack() + 50;
    }

    @Override
    public void withdraw() {
        soldato.withdraw();
    }

}
