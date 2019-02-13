/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.facade;

/**
 *
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        CompanyFacade facade = new CompanyFacade();
        facade.startNormalDay();
        facade.endNormalDay();
        facade.strikeDay();
    }
}
