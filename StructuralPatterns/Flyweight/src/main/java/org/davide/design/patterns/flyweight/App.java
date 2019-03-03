/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.flyweight;

import org.davide.design.patterns.flyweight.models.DrugEnum;

/**
 * This is the Client class.
 *
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        factory.getFlyweight(DrugEnum.ANTIBIOTIC).takeDrug();
        factory.getFlyweight(DrugEnum.ASPIRIN).takeDrug();
        factory.getFlyweight(DrugEnum.PARACETAMOL).takeDrug();
        factory.getFlyweight(DrugEnum.ANTIBIOTIC).takeDrug();
        factory.getFlyweight(DrugEnum.ASPIRIN).takeDrug();
    }
}
