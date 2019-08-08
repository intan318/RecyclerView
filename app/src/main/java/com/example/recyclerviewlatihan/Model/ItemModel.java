package com.example.recyclerviewlatihan.Model;

public class ItemModel {
    String title;
    String description;
    int image;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public ItemModel(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}

