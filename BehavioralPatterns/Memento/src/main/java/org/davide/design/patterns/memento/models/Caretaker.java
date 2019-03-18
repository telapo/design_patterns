/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.memento.models;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Caretaker that keeps the various Memento objs.
 * 
 * @author davide
 */
public class Caretaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
