package com.michelfigueiredo.designpattern.behavioural.observer.news_with_propertychangelistener;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCLNewsChannelObserverTest {
    @Test
    void can_observe_a_change() {
        PCLNewsAgencyObservable observable = new PCLNewsAgencyObservable();
        PCLNewsChannelObserver observer = new PCLNewsChannelObserver();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");

        assertEquals(observer.getNews(), "news");
    }
}
