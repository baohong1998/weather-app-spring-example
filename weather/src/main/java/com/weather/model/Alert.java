package com.weather.model;

import java.util.List;

public class Alert {
    public String getSenderName() {
        return senderName;
    }

    public String getEvent() {
        return event;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    private String senderName;
    private String event;
    private long start;
    private long end;
    private String description;
    private List<String> tags;
}
