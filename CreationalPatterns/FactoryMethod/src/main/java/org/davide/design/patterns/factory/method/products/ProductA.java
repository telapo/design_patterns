/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.factory.method.products;

/**
 *
 * @author davide
 */
public class ProductA implements Products{

    @Override
    public String printMe() {
        return "I am product A";
    }
    
}
