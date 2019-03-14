/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.mediator.models;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the concrete implementation of a Mediator.
 * 
 * It keeps a list of objects, and sends the messages, which actually means to
 * call the receive() method on each one of them.
 * 
 * @author davide
 */
public class ConcreteMediator implements Mediator {

    private List<ColleagueUserInterface> users;

    public ConcreteMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(ColleagueUserInterface user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, ColleagueUserInterface user) {
        for (ColleagueUserInterface u : this.users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }

}
