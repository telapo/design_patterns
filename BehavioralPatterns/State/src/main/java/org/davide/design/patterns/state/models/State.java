/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.state.models;

/**
 * This is the State interface.
 * 
 * It defines the behavior that depends on the Context (doAction in this case).
 * 
 * @author davide
 */
public interface State {

    public void doAction(Context context);
}
