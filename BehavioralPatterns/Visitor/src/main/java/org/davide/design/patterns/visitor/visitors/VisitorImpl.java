/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.visitor.visitors;

import org.davide.design.patterns.visitor.nodes.Computer;
import org.davide.design.patterns.visitor.nodes.Keyboard;
import org.davide.design.patterns.visitor.nodes.Monitor;
import org.davide.design.patterns.visitor.nodes.Mouse;

/**
 * This is the ConcreteVisitor class, which implements the operation declared by
 * the visitor.
 * 
 * @author davide
 */
public class VisitorImpl implements Visitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

}
