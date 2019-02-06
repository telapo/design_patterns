/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.decorator.models;

/**
 * This is the interface of objects that can have additional responsibilities.
 * 
 * @author davide
 */
public interface Soldato {

    void attack();

    int getStrengthOfAttack();

    void withdraw();
}
