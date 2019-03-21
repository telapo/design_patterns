/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.templatemethod;

import org.davide.design.patterns.templatemethod.models.Cricket;
import org.davide.design.patterns.templatemethod.models.Football;
import org.davide.design.patterns.templatemethod.models.Game;

/**
 * This is the Client app.
 * 
 * It instantiates 2 concrete classes and call the algorithm method.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        
        System.out.println();
        
        game = new Football();
        game.play();
    }
}
