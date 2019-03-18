/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.memento.models;

/**
 * This is the Originator, which saves its internal state in a Memento.
 * 
 * @author davide
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // save snapshot
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // restore snapshot
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
