package com.example.pranay.ecellgallery;

import java.io.Serializable;

/**
 * Created by pranay on 28-07-2018.
 */

public class Image implements Serializable{

    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
