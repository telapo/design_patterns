/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.interpreter.iterator;

import java.util.List;

/**
 * This is a NonTerminalExpression or a Terminal, so it is a node in the 
 * abstract tree.
 * 
 * It is a Non Terminal Expression because in the interpret() method, it calls
 * another interpret() of another Expression. However, it may also be terminal,
 * if the where clause is null.
 * 
 * @author davide
 */
public class From implements AbstractExpression {
 
    // table where the results will be selected
    private String table;
    // optional where clause
    private Where where;

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    public From(String table) {
        this.table = table;
    }
 
    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);
        if (where == null) {
            return context.search();
        }
        return where.interpret(context);
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
        this.where = where;
    }
    
    
}