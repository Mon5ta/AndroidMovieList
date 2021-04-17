package com.android.AndroidMovieList.model;

public class MovieModel {
    private final String title;
    private final String image;

    public MovieModel(String title, String image) {
        this.title = title;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }
}
