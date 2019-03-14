/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.mediator;

import org.davide.design.patterns.mediator.models.ColleagueUser;
import org.davide.design.patterns.mediator.models.ColleagueUserInterface;
import org.davide.design.patterns.mediator.models.ConcreteMediator;
import org.davide.design.patterns.mediator.models.Mediator;

/**
 * This is the Client obj.
 * 
 * It instantiates the Mediator, created the various objs that use it, and then
 * calls some actions on them
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ColleagueUserInterface user1 = new ColleagueUser("Gino", mediator);
        ColleagueUserInterface user2 = new ColleagueUser("Panda", mediator);
        ColleagueUserInterface user3 = new ColleagueUser("Zorro", mediator);
        ColleagueUserInterface user4 = new ColleagueUser("Lisa", mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
        user2.send("Hi!");
    }
}
