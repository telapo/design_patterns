/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.facade.models;

/**
 * First subsystem
 * 
 * @author davide
 */
public abstract class BlueCollarAbstract implements Employee {

    String name;
    int id;
    String work;

    public BlueCollarAbstract(String name, int id, String work) {
        this.name = name;
        this.id = id;
        this.work = work;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getWork() {
        return this.work;
    }

    public abstract void mountCar();

    public abstract void clearShopfloor();

    public abstract void goOnStrike();
}
