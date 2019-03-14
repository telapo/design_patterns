/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.mediator.models;

/**
 * This is the Colleague interfaces, which represents the objs that use the 
 * Mediator to communicate.
 * 
 * It defines the two methods used of send() and receive();
 * 
 * @author davide
 */
public abstract class ColleagueUserInterface {

    private final String name;
    private final Mediator mediator;

    public ColleagueUserInterface(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

}
