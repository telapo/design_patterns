/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.mediator.models;

/**
 * This is the concrete implementation of a Colleague abstract class.
 * 
 * It actually implements the send and receive methods().
 * 
 * @author davide
 */
public class ColleagueUser extends ColleagueUserInterface {

    public ColleagueUser(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.getName() + " sending message: " + msg);
        this.getMediator().sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + ": Received Message:" + msg);
    }

}
