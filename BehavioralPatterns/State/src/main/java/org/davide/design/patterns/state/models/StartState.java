/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.state.models;

/**
 * This is a ConcreteState class, which implements the behavior that depends
 * on the context.
 * 
 * @author davide
 */
public class StartState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this);	
   }

   @Override
   public String toString(){
      return "Start State";
   }
}
