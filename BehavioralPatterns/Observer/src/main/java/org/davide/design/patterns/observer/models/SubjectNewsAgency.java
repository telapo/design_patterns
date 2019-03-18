/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.observer.models;

import java.util.Observable;

/**
 * This is a Subject class.
 * 
 * It extends Observable, and updates Observers when a news is set.
 * 
 * @author davide
 */
public class SubjectNewsAgency extends Observable {

    private String news;

    public SubjectNewsAgency() {
        this.news = "";
    }

    public void setNews(String news) {
        this.news = news;
        // both provided with the interface
        setChanged();
        notifyObservers(news);
    }
}
