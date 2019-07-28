package com.michelfigueiredo.designpattern.behavioural.observer.news2;

import java.util.Observable;

public class ONewsAgencyObservable extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
