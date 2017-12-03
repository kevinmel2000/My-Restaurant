package com.omrobbie.myrestaurant;

import android.support.annotation.DrawableRes;

/**
 * Created by omrobbie on 03/12/2017.
 */

public class MenuData {

    private String name;
    private String price;
    private int picture;

    public MenuData(String name, String price, @DrawableRes int picture) {
        this.name = name;
        this.price = price;
        this.picture = picture;
    }

    public MenuData(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
