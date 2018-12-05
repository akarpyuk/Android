package com.first.firstprogramm.dto;

public class CategoriesDTO {

    private String title;
    private int count;
    private int price;
    private int image;

    public CategoriesDTO(String title, int price, int image) {
        this.title = title;
        this.price = price;
        this.count = 0;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }








}
