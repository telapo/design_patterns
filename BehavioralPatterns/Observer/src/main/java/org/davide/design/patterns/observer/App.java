/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.observer;

import org.davide.design.patterns.observer.change.manager.ObserverNewsChannelWithChangeManager;
import org.davide.design.patterns.observer.change.manager.SubjectChangeManager;
import org.davide.design.patterns.observer.models.ObserverNewsChannel;
import org.davide.design.patterns.observer.models.SubjectNewsAgency;

/**
 * This is the Client.
 * 
 * It has 2 implementations, the first one uses 2 java interfaces Observable,
 * and Observer. The second one, uses PropertyChangeSupport and Listener.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        /*
        USING Java Observable and Observer inferaces
        */
        SubjectNewsAgency subject = new SubjectNewsAgency();
        ObserverNewsChannel channelOne = new ObserverNewsChannel("Channel One");
        ObserverNewsChannel channelTwo = new ObserverNewsChannel("Channel Two");

        subject.addObserver(channelOne);
        subject.addObserver(channelTwo);

        subject.setNews("Shares up 1%!");
        System.out.println(channelOne.getChannelName() + " breaking news: "
                + channelOne.getNews());
        System.out.println(channelTwo.getChannelName() + " breaking news: "
                + channelTwo.getNews());

        /*
        ALTERNATIVE USING Java Change Manager, called PropertyChangeSupport and
        PropertyChangeListener.
         */
        SubjectChangeManager subjectChangeManager = new SubjectChangeManager();
        ObserverNewsChannelWithChangeManager channelThree
                = new ObserverNewsChannelWithChangeManager("Channel 3");
        ObserverNewsChannelWithChangeManager channelFour
                = new ObserverNewsChannelWithChangeManager("Channel 4");

        subjectChangeManager.addPropertyChangeListener(channelThree);
        subjectChangeManager.addPropertyChangeListener(channelFour);

        subjectChangeManager.setNews("Shares down 5%!!!");
        System.out.println(channelThree.getChannelName() + " breaking news: "
                + channelThree.getNews());
        System.out.println(channelFour.getChannelName() + " breaking news: "
                + channelFour.getNews());

    }
}
