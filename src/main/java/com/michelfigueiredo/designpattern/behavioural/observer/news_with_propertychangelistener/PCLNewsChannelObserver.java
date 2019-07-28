package com.michelfigueiredo.designpattern.behavioural.observer.news_with_propertychangelistener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannelObserver implements PropertyChangeListener {

    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
