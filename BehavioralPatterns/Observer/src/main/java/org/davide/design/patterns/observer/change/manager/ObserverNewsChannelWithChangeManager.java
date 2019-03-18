/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.observer.change.manager;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author davide
 */
public class ObserverNewsChannelWithChangeManager implements PropertyChangeListener {

    private String news;
    private final String channelName;

    public ObserverNewsChannelWithChangeManager(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
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
