/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.facade.models;

/**
 *
 * @author davide
 */
public class BlueCollarImpl extends BlueCollarAbstract {

    public BlueCollarImpl(String name, int id, String work) {
        super(name, id, work);
    }

    @Override
    public void mountCar() {
        System.out.println(name + " is mounting a car");
    }

    @Override
    public void clearShopfloor() {
        System.out.println(name + " is cleaning the shopfloor");
    }

    @Override
    public void goOnStrike() {
        System.out.println(name + " is on strike");
    }

}
