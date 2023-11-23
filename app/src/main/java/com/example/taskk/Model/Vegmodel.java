package com.example.taskk.Model;

public class Vegmodel {
    String dishname1;
    int image1,price1;

    public Vegmodel(String dishname1, int image1, int price1) {
        this.dishname1 = dishname1;
        this.image1 = image1;
        this.price1 = price1;
    }

    public String getDishname1() {
        return dishname1;
    }

    public void setDishname1(String dishname1) {
        this.dishname1 = dishname1;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getPrice1() {
        return price1;
    }

    public void setPrice1(int price1) {
        this.price1 = price1;
    }
}
