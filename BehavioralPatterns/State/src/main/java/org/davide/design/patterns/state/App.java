/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.state;

import org.davide.design.patterns.state.models.Context;
import org.davide.design.patterns.state.models.StartState;
import org.davide.design.patterns.state.models.StopState;

/**
 * This is the Client.
 * 
 * It instantiates the context, the various State objs and does actions, which
 * depend on them.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
