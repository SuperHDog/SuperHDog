package com.example.wechat;

public class Contact {
    String name;
    int image;

    public Contact(String name,int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
