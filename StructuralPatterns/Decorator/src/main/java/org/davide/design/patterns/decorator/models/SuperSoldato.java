/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.decorator.models;

/**
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
