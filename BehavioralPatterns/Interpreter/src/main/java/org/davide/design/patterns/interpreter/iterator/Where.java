/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.interpreter.iterator;

import java.util.List;
import java.util.function.Predicate;

/**
 * This is a Terminal Expression, so it is a node in the abstract tree.
 * 
 * It is terminal because the interpret() method does not call any other 
 * interpret.
 * 
 * @author davide
 */
public class Where implements AbstractExpression {
 
    // condition to filter the results
    private Predicate<String> filter;

    public Where(Predicate<String> filter) {
        this.filter = filter;
    }
 
    @Override
    public List<String> interpret(Context context) {
        context.setFilter(filter);
        return context.search();
    }

    public Predicate<String> getFilter() {
        return filter;
    }

    public void setFilter(Predicate<String> filter) {
        this.filter = filter;
    }
    
}
