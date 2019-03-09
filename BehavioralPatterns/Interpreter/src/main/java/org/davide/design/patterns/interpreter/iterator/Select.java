package org.davide.design.patterns.interpreter.iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;

/**
 * This is a NonTerminalExpression, so it is a node in the abstract tree.
 * 
 * It is a Non Terminal Expression because in the interpret() method, it calls
 * another interpret() of another Expression.
 *
 * @author davide
 */
public class Select implements AbstractExpression {

    // name of the column that will be selected
    private String column;
    // from object that will be used in the interpret() method
    private From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setColumn(column);
        return from.interpret(context);
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

}
