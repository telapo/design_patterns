/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.facade.models;

/**
 * Second subsystem
 * 
 * @author davide
 */
public abstract class WhiteCollarAbstract implements Employee {

    String name;
    int id;
    String work;

    public WhiteCollarAbstract(String name, int id, String work) {
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

    public abstract void goToMeeting();

    public abstract void useComputer();

    public abstract void avoidStrike();

}
