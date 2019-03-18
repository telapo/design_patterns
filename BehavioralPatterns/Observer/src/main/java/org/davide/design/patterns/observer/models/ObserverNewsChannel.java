/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.observer.models;

import java.util.Observable;
import java.util.Observer;

/**
 * This is an Observer implementation.
 * 
 * When the subject changes, the news on this channel are changed as well.
 * 
 * @author davide
 */
public class ObserverNewsChannel implements Observer {

    private String news;
    private final String channelName;

    public ObserverNewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setNews((String) arg);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getChannelName() {
        return channelName;
    }

}
