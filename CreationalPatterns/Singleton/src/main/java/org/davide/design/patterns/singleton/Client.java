/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.singleton;

/**
 *
 * @author davide
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Hash code 1 : " + singleton.hashCode());

        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Hash code 2 : " + singleton1.hashCode());
        
        if(singleton == singleton1){
            System.out.println("They are the same!");
        } else{
            System.out.println("Something wrong...");
        }
    }
}
