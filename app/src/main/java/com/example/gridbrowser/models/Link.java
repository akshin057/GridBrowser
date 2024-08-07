package com.example.gridbrowser.models;

public class Link {
    private String name;
    private String url;
    private int image;

    public Link(String name, String url, int image) {
        this.name = name;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getImage() {
        return image;
    }
}
