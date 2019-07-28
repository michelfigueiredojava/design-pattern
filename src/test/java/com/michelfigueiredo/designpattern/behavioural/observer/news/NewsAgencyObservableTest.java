package com.michelfigueiredo.designpattern.behavioural.observer.news;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsAgencyObservableTest {

    @Test
    void can_be_updated() {
        NewsAgencyObservable observable = new NewsAgencyObservable();
        NewsChannelObserver observer = new NewsChannelObserver();

        observable.addObserver(observer);
        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }
}
