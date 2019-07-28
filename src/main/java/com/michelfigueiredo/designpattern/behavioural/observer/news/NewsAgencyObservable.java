package com.michelfigueiredo.designpattern.behavioural.observer.news;

import java.util.ArrayList;
import java.util.List;

public class NewsAgencyObservable {
    private String news;
    private List<ChannelObserver> channelObservers = new ArrayList<>();

    public void addObserver(ChannelObserver channelObserver) {
        this.channelObservers.add(channelObserver);
    }

    public void removeObserver(ChannelObserver channelObserver) {
        this.channelObservers.remove(channelObserver);
    }

    public void setNews(String news) {
        this.news = news;
        for (ChannelObserver channelObserver : this.channelObservers) {
            channelObserver.update(this.news);
        }
    }
}
