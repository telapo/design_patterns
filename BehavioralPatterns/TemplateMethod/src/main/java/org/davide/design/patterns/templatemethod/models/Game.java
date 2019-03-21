/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.templatemethod.models;

/**
 * This is the AstractClass.
 * 
 * It defines the algorithm method, and leaves 3 methods to be implemented by
 * the subclasses.
 * 
 * @author davide
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
