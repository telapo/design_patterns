/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.observer.change.manager;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * This is another Subject.
 * 
 * It keeps a reference to a PropertyChangeSupport object, which is used to add,
 * remove or fire a change.
 * 
 * @author davide
 */
public class SubjectChangeManager {

    private String news;

    private final PropertyChangeSupport support;

    public SubjectChangeManager() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}
