/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.visitor;

import org.davide.design.patterns.visitor.nodes.Computer;
import org.davide.design.patterns.visitor.visitors.VisitorImpl;

/**
 * The Client app that instantiate the obj structure (Computer), and then passes
 * it the ConcreteVisitor using the accept() method.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new VisitorImpl());
    }
}
