package com.michelfigueiredo.designpattern.behavioural.observer.news2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ONewsChannelObserverTest {

    @Test
    void can_observe_a_change() {
        ONewsAgencyObservable observable = new ONewsAgencyObservable();
        ONewsChannelObserver observer = new ONewsChannelObserver();

        observable.addObserver(observer);
        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }
}
