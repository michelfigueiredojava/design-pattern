package com.michelfigueiredo.designpattern.behavioural.observer.news_with_propertychangelistener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCLNewsAgencyObservable {
    private String news;

    private PropertyChangeSupport support;

    public PCLNewsAgencyObservable() {
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
