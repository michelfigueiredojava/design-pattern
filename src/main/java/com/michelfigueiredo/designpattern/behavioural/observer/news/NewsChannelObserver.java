package com.michelfigueiredo.designpattern.behavioural.observer.news;

public class NewsChannelObserver implements ChannelObserver {
    private String news;

    @Override
    public void update(Object news) {
        this.news = ((String) news);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
