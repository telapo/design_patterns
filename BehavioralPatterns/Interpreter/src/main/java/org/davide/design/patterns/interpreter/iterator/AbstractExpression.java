/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.interpreter.iterator;

import java.util.List;

/**
 * This is the abstract Interpret operation that is common to all the nodes
 * of the abstract tree.
 * 
 * @author davide
 */
public interface AbstractExpression {

    List<String> interpret(Context ctx);
}
