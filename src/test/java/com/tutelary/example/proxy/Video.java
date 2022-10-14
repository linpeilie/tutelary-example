package com.tutelary.example.proxy;

import lombok.Data;

@Data
public class Video {
    private String id;
    private String title;
    private String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video...";
    }
}
