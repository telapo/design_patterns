/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.memento;

import org.davide.design.patterns.memento.models.Caretaker;
import org.davide.design.patterns.memento.models.Originator;

/**
 * This is the Client.
 * 
 * It creates an Originator, a Caretaker to store previous states of the
 * originator, and then uses the Memento to restore them.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        // the state is 2
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        // another memento with state 3
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.getMemento(0));
        // should print 2
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(caretaker.getMemento(1));
        // should print 3
        System.out.println("Second saved State: " + originator.getState());
    }
}
