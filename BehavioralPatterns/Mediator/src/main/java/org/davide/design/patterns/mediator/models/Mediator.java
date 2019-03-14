/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.mediator.models;

/**
 * This is the Mediator interface.
 * 
 * The example is about a chat; so, it sends messages, and adds users to them.
 * 
 * @author davide
 */
public interface Mediator {

    public void sendMessage(String msg, ColleagueUserInterface user);

    void addUser(ColleagueUserInterface user);
}
