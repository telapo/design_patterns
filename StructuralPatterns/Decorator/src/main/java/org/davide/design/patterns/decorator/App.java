/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.decorator;

import org.davide.design.patterns.decorator.models.SimpleSoldato;
import org.davide.design.patterns.decorator.models.Soldato;
import org.davide.design.patterns.decorator.models.SuperSoldato;

/**
 *
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        Soldato soldier = new SimpleSoldato();
        soldier.attack();
        System.out.println("Strength: " + soldier.getStrengthOfAttack());
        soldier.withdraw();
        
        // decorated object
        Soldato superSoldier = new SuperSoldato(soldier);
        superSoldier.attack();
        System.out.println("Strength: " + superSoldier.getStrengthOfAttack());
        superSoldier.withdraw();
    }
}
