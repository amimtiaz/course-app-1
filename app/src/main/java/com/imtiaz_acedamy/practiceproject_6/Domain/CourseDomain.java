package com.imtiaz_acedamy.practiceproject_6.Domain;

public class CourseDomain {
    private String title;
    private double price;
    private String picPath;

    public CourseDomain(String title, double price, String picPath) {
        this.title = title;
        this.price = price;
        this.picPath = picPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
